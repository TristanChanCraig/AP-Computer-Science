package Quarter4.SocketLab.Server;

/*
	Program:	Log in server
				This program implements the authentication server
				Protocol message format: "[Type of Message];[data];[data]"
	Created on: 4/27/2023
	Created by: Jiazhen Zhou
	Revised on:
	Revised by:

 */
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.ArrayList;

public class LoginServer {
    public static void main(String[] args) throws Exception {
        final int PORT = 33235; //port number for this server application
        //setup welcome socket
        ServerSocket welcomeSocket = new ServerSocket(PORT);
        System.out.println("Now listening at " + welcomeSocket.getLocalSocketAddress());

        while (true) {//Server runs an infinite loop to provide service at any time
            //setup communication with client
            Socket connectionSocket = welcomeSocket.accept(); //session socket
            System.out.println("Connected to " + connectionSocket.getInetAddress());
            BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
            DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());

            String username = "";

            //Receive and parse protocol message
            String protocolMessage = inFromClient.readLine();

            System.out.println("Received from client: " + protocolMessage);
            String[] parsedProtocolMessage = protocolMessage.split(";");

            //Handle login requests
            if (parsedProtocolMessage[0].equalsIgnoreCase("loginRequest")) {
                //parse protocol message
                username = parsedProtocolMessage[1];
                String password = parsedProtocolMessage[2];
                System.out.println("User Name: " + username + ", password: " + password);

                //check to see if username/password matches
                boolean match = checkUsernamePassword(username, password);
                String outgoingProtocolMessage = "";
                /**TODO: Construct the response protocol message by referring to the client
                 * side program's handling of server's response message*****/
                if (!match) {
                    outgoingProtocolMessage = "loginResponse;failure";
                } else {
                    outgoingProtocolMessage = "loginResponse;success";
                    System.out.println("Response to client:" + outgoingProtocolMessage);
                }
                /**TODO: Encrypt the message before sending out *****/
                System.out.println("Response to client:" + outgoingProtocolMessage);
                outToClient.writeBytes(outgoingProtocolMessage + "\n");
            }//end of if(loginRequest) block
            else {
                System.out.println("Request not supported!");
            }

            //close the connection when the session is finished
            connectionSocket.close();
        }
    }

    public static boolean checkUsernamePassword(String username, String password) {
        //setup variables
        String combo = username + "," + password;
        boolean match = false;

        try {
            //read the file searching for username/password combo
            File myFile = new File("C:\\Users\\chan.t3\\IdeaProjects\\AP-Computer-Science\\src\\Quarter4\\SocketLab\\Server\\usernamepassword.txt");
            Scanner myScanner = new Scanner(myFile);
            while (myScanner.hasNextLine()) {
                String line = myScanner.nextLine();
                if (line.equals(combo)) {
                    match = true;
                }
            }

            //deal with exceptions
        } catch (FileNotFoundException e) {
            System.out.println("Cannot find the password file"); //I probably don't need both of these
            System.err.println(e);
        }

        return match;
    }
}