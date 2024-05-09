package Quarter4.SocketLab.Client;

/*
	Program:	Log in client
				This program implements the client side (i.e. app) of log in
				Protocol message format: "[Type of Message];[data];[data]"
	Created on: 4/27/2023
	Created by: Jiazhen Zhou
	Revised on:
	Revised by:

 */
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class LoginClient {
    public static void main(String[] args) throws Exception{
        String SERVER = "127.0.0.1"; //or IP address ("localhost")
        final int PORT = 33235; //Use the port number of the server (33235)

        Scanner myScanner = new Scanner(System.in);
        //System.out.println(" Input the IP address of the server:");
        //SERVER = myScanner.next();
        //Setup communication with server using the socket
        System.out.println("Connecting to the authentication server...");
        Socket clientSocket = new Socket(SERVER, PORT);
        System.out.println(" Connected.");

        //Set up the interface for sending/receiving packets to/from the server
        DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
        BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));


        /*** TODO 2: ALLOW USERS TO TRY UP TO 5 TIMES IF THE USERNAME/PASSWORD IS INCORRECT***/

        //Get login info from the user
        System.out.print("Enter Username:\n");
        String username = myScanner.next();
        System.out.print("Enter Password:\t");
        String password = myScanner.next();

        //Send login request to the authentication server
        //TODO 1: Construct login message as the action word + username + password,
        //		with the right separator between the component. Refer to the server
        //		side program to set up your client side protocol message correctly
        String protocolMessage = "loginRequest;"+username+";"+password;
        System.out.print("Sending request to host...");

        outToServer.writeBytes(protocolMessage + "\n");
        System.out.println(" Sent.");

        //Handle response from server
        String loginResponse = inFromServer.readLine();

        System.out.println("Response: " + loginResponse);
        String[] parsedLoginResponse = loginResponse.split(";");

        //Handle login response messages
        if(parsedLoginResponse[0].equalsIgnoreCase("loginResponse")) {
            if(parsedLoginResponse[1].equalsIgnoreCase("success")){//success
                System.out.println("Login Succeed! Congratulations!");
                //In the real application, more later operations will be allowed after a successful login
            }else{ //failure
                System.out.println("Login Failed! Either user name or password incorrect!");
            }
        }

        //The session is over, close the socket
        System.out.println("Thank you for using the Login system!");
        clientSocket.close();

    }
}