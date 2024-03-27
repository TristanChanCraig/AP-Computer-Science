package Quarter3.JavaSwingHehe.game.entity;

import Quarter3.JavaSwingHehe.game.main.GamePanel;
import Quarter3.JavaSwingHehe.game.main.KeyHandler;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Player extends Entity {
    GamePanel gp;
    KeyHandler keyH;

    public Player(GamePanel gp, KeyHandler keyH) {
        this.gp = gp;
        this.keyH = keyH;

        setDefaultValues();
    }

    public void setDefaultValues() {
        x = 0;
        y = 0;
//        speed = 4;
        speed = 2;
        direction = "down";
    }

    public void getPlayerImage() {
        try {
            up1 = ImageIO.read(new File("src/Quarter3/JavaSwingHehe/game/pics/boy_up_1.png"));
            up2 = ImageIO.read(new File("src/Quarter3/JavaSwingHehe/game/pics/boy_up_2.png"));
            down1 = ImageIO.read(new File("src/Quarter3/JavaSwingHehe/game/pics/boy_down_1.png"));
            down2 = ImageIO.read(new File("src/Quarter3/JavaSwingHehe/game/pics/boy_down_2.png"));
            left1 = ImageIO.read(new File("src/Quarter3/JavaSwingHehe/game/pics/boy_left_1.png"));
            left2 = ImageIO.read(new File("src/Quarter3/JavaSwingHehe/game/pics/boy_left_2.png"));
            right1 = ImageIO.read(new File("src/Quarter3/JavaSwingHehe/game/pics/boy_right_1.png"));
            right2 = ImageIO.read(new File("src/Quarter3/JavaSwingHehe/game/pics/boy_right_2.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void update() {
        if (keyH.upPressed == true || keyH.downPressed == true
                || keyH.rightPressed == true || keyH.leftPressed == true) {

            if (keyH.upPressed == true) {
                direction = "up";
                y -= speed;
            } else if (keyH.downPressed == true) {
                direction = "down";
                y += speed;
            } else if (keyH.leftPressed == true) {
                direction = "left";
                x -= speed;
            } else if (keyH.rightPressed == true) {
                direction = "right";
                x += speed;
            }
            if (x < 0) x = 0;
            else if (x > 720) x = 720;
            else if (y < 0) y = 0;
            else if (y > 525) y = 525;
            spriteCounter++;
            if (spriteCounter > 10) {
                if (spriteNum == 1) {
                    spriteNum = 2;
                } else if (spriteNum == 2) spriteNum = 1;
                spriteCounter = 0;
            }
            System.out.println("X = " + x);
            System.out.println("Y = " + y);
            System.out.println("Speed = " + speed);
            speed = Math.pow(speed, 1.0001);
        }
    }

    public void draw(Graphics2D g2) {
//        g2.setColor(Color.white);
//
//        g2.fillRect(x, y, gp.tileSize, gp.tileSize);

        BufferedImage image = null;
        getPlayerImage();

        switch (direction) {
            case "up":
                if (spriteNum == 1) {
                    image = up1;
                }
                if (spriteNum == 2) {
                    image = up2;
                }
                break;
            case "down":
                if (spriteNum == 1) {
                    image = down1;
                }
                if (spriteNum == 2) {
                    image = down2;
                }
                break;
            case "left":
                if (spriteNum == 1) {
                    image = left1;
                }
                if (spriteNum == 2) {
                    image = left2;
                }
                break;
            case "right":
                if (spriteNum == 1) {
                    image = right1;
                }
                if (spriteNum == 2) {
                    image = right2;
                }
                break;
        }
        g2.drawImage(image, x, y, gp.tileSize, gp.tileSize, null);
    }
}
