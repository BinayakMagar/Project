import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyProgram
{
    public static void main(String[] args)
    {
        JFrame pFrame = new JFrame();
        pFrame.setVisible(true);
        pFrame.setLayout(null);
        pFrame.setSize(600, 550);
        pFrame.setResizable(false);

        ImageIcon wp = new ImageIcon("Wallpaper.gif");
        JLabel wallpaper = new JLabel(wp);
        wallpaper.setLayout(null);
        wallpaper.setSize(1000, 1000);
        wallpaper.setLocation(0, 0);
        pFrame.add(wallpaper);

        ImageIcon stickman = new ImageIcon("Stickman.gif");
        JLabel gif = new JLabel(stickman);
        gif.setLayout(null);
        gif.setSize(1000, 1000);
        gif.setLocation(-75, -100);
        pFrame.add(gif);

        JLabel mainTitle = new JLabel();

        new Thread(new Runnable() {
            @Override

            public void run() {
                while (true) {
                    if (pFrame.isVisible() == true) {
                        String[] Colors = {
                            "black",
                            "blue",
                            "cyan",
                            "green",
                            "magenta",
                            "orange",
                            "pink",
                            "red",
                            "yellow"
                        };

                        int randomColor = (int)(Math.random() * (Colors.length - 0) + 0);

                        String[] Formats = {
                            "<html><font color=" + Colors[randomColor] + ">H</font><html>ANGMAN</html>",
                            "<html>H<font color=" + Colors[randomColor] + ">A</font><html>NGMAN</html>",
                            "<html>HA<font color=" + Colors[randomColor] + ">N</font>GMAN</html>",
                            "<html>HAN<font color=" + Colors[randomColor] + ">G</font>MAN</html>",
                            "<html>HANG<font color=" + Colors[randomColor] + ">M</font>AN</html>",
                            "<html>HANGM<font color=" + Colors[randomColor] + ">A</font>N</html>",
                            "<html>HANGMA<font color=" + Colors[randomColor] + ">N</font></html>"
                        };

                        int randomFormat = (int)(Math.random() * (Formats.length - 0) + 0);
                        int output = 0;

                        String formatOutput = "null";

                        if (output != randomFormat || randomFormat != output) {
                            output = randomFormat;

                            if (formatOutput != Formats[randomFormat] || Formats[randomFormat] != formatOutput) {
                                formatOutput = Formats[randomFormat];
                                mainTitle.setText(Formats[randomFormat]);
                            }
                        };

                        try {
                            Thread.sleep(250);
                        } catch (InterruptedException delay) {
                            Thread.currentThread().interrupt();
                        }
                    } else {
                        break;
                    }
                }
            }
        }).start();

        mainTitle.setLayout(null);
        mainTitle.setSize(1000, 1000);
        mainTitle.setFont(new Font("Serif", Font.BOLD, 55));
        mainTitle.setLocation(115, -410);
        pFrame.add(mainTitle);

        String[] dots = {
            "Status: Waiting.",
            "Status: Waiting..",
            "Status: Waiting..."
        };

        JLabel status = new JLabel();
        status.setLayout(null);
        status.setSize(500, 500);
        status.setFont(new Font("Serif", Font.BOLD, 15));
        status.setLocation(225, 75);
        pFrame.add(status);

        new Thread(new Runnable() {
            public void run() {
                int dl = dots.length;

                for (int i = 0; i <= dl; i++) {
                    if (pFrame.isVisible() == true) {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException delay) {
                            Thread.currentThread().interrupt();
                        }

                        if (i < dl) {
                            status.setText(dots[i]);
                        } else if (i == dl) {
                            i = 0;
                            status.setText(dots[i]);
                        }
                    } else {
                        break;
                    }
                }
            }
        }).start();

        JLabel credit = new JLabel("Credit: Binayak Magar");
        credit.setLayout(null);
        credit.setSize(500, 500);
        credit.setFont(new Font("Serif", Font.BOLD, 20));
        credit.setLocation(0, 288);
        pFrame.add(credit);

        JButton play = new JButton("CLICK TO PLAY");
        play.setLayout(null);
        play.setSize(100, 100);
        play.setFont(new Font("Serif", Font.BOLD, 50));
        Dimension pSize = play.getPreferredSize();
        play.setBounds(100, 100, pSize.width, pSize.height);
        play.setLocation(50, 225);
        play.setBorder(null);
        play.setBackground(Color.LIGHT_GRAY);
        play.setVisible(true);
        pFrame.add(play);

        new Thread(new Runnable() {
            @Override

            public void run() {
                while (true) {
                    if (pFrame.isVisible() == true) {
                        play.setForeground(Color.GREEN);

                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException delay) {
                            Thread.currentThread().interrupt();
                        }

                        play.setForeground(null);

                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException delay) {
                            Thread.currentThread().interrupt();
                        }
                    } else {
                        break;
                    }
                }
            }
        }).start();

        play.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent Play) {
                pFrame.setVisible(false);

                JFrame frame = new JFrame();

                frame.setLayout(null);
                frame.setSize(600, 600);
                frame.setResizable(false);

                JMenuBar menuBar = new JMenuBar();

                JButton reveal = new JButton("Reveal");
                reveal.setLayout(null);
                reveal.setBorder(null);
                menuBar.add(reveal);

                JLabel version = new JLabel("Version 1.0");
                version.setLayout(null);
                Dimension vSize = version.getPreferredSize();
                version.setBounds(100, 100, vSize.width, vSize.height);
                version.setLocation(515, 0);
                frame.add(version);

                JLabel title = new JLabel();
                title.setLayout(null);
                Dimension tSize = title.getPreferredSize();
                title.setBounds(100, 100, tSize.width, tSize.height);
                title.setLocation(130, -225);
                title.setSize(500, 500);
                title.setFont(new Font("Serif", Font.BOLD, 50));
                frame.add(title);

                new Thread(new Runnable() {
                    @Override

                    public void run() {
                        String name = "HANGMAN";
                        int len = name.length();

                        Color[][] colorTable = new Color[len + 1][len + 1];
                        colorTable[0][0] = Color.RED;
                        colorTable[0][1] = Color.YELLOW;
                        colorTable[0][2] = Color.ORANGE;
                        colorTable[0][3] = Color.BLUE;
                        colorTable[0][4] = Color.GREEN;
                        colorTable[0][5] = Color.PINK;
                        colorTable[0][6] = Color.CYAN;
                        colorTable[0][7] = null;

                        for (int i = 0; i <= len; i+=0) {
                            String newName = name.substring(0, i);

                            title.setForeground(colorTable[0][i]);
                            title.setText(newName);

                            if (i >= len && newName == name) {
                                if (i > len) {
                                    title.setText(null);
                                }

                                i = 0;
                            } else {
                                i++;
                            }

                            try {
                                Thread.sleep(800);
                            } catch (InterruptedException delay) {
                                Thread.currentThread().interrupt();
                            }
                        }
                    }
                }).start();

                String[] dts = {
                    "Status: Playing.",
                    "Status: Playing..",
                    "Status: Playing..."
                };

                JLabel st = new JLabel();
                st.setLayout(null);
                st.setSize(500, 500);
                st.setFont(new Font("Serif", Font.BOLD, 15));
                st.setLocation(225, -180);
                frame.add(st);

                new Thread(new Runnable() {
                    public void run() {
                        int ndl = dts.length;

                        for (int i = 0; i <= ndl; i++) {
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException delay) {
                                Thread.currentThread().interrupt();
                            }

                            if (i < ndl) {
                                st.setText(dts[i]);
                            } else if (i == ndl) {
                                i = 0;
                                st.setText(dts[i]);
                            }

                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException delay) {
                                Thread.currentThread().interrupt();
                            }
                        }
                    }
                }).start();

                frame.setJMenuBar(menuBar);

                JLabel[] red = new JLabel[6];

                ImageIcon Hanger = new ImageIcon("Hanger.gif");
                JLabel JLHanger = new JLabel(Hanger);
                JLHanger.setLayout(null);
                JLHanger.setSize(1000, 1000);
                JLHanger.setLocation(-222, -215);
                frame.add(JLHanger);

                ImageIcon RH = new ImageIcon("Red_Head.gif");
                red[0] = new JLabel(RH);
                red[0].setLayout(null);
                red[0].setSize(1000, 1000);
                red[0].setLocation(-260, -180);
                red[0].setVisible(false);
                frame.add(red[0]);

                ImageIcon RT = new ImageIcon("Red_Torso.gif");
                red[1] = new JLabel(RT);
                red[1].setLayout(null);
                red[1].setSize(1000, 1000);
                red[1].setLocation(-260, -180);
                red[1].setVisible(false);
                frame.add(red[1]);

                ImageIcon RRA = new ImageIcon("Red_RightArm.gif");
                red[2] = new JLabel(RRA);
                red[2].setLayout(null);
                red[2].setSize(1000, 1000);
                red[2].setLocation(-270, -182);
                red[2].setVisible(false);
                frame.add(red[2]);

                ImageIcon RLA = new ImageIcon("Red_LeftArm.gif");
                red[3] = new JLabel(RLA);
                red[3].setLayout(null);
                red[3].setSize(1000, 1000);
                red[3].setLocation(-260, -180);
                red[3].setVisible(false);
                frame.add(red[3]);

                ImageIcon RRL = new ImageIcon("Red_RightLeg.gif");
                red[4] = new JLabel(RRL);
                red[4].setLayout(null);
                red[4].setSize(1000, 1000);
                red[4].setLocation(-260, -180);
                red[4].setVisible(false);
                frame.add(red[4]);

                ImageIcon RLL = new ImageIcon("Red_LeftLeg.gif");
                red[5] = new JLabel(RLL);
                red[5].setLayout(null);
                red[5].setSize(1000, 1000);
                red[5].setLocation(-260, -180);
                red[5].setVisible(false);
                frame.add(red[5]);

                JLabel letter = new JLabel("Type a char/word: ");
                letter.setLayout(null);
                letter.setSize(1000, 1000);
                letter.setLocation(50, -71);
                letter.setFont(new Font("Serif", Font.BOLD, 15));
                frame.add(letter);

                JTextField textBox = new JTextField();
                textBox.setLayout(null);
                textBox.setSize(250, 30);
                textBox.setLocation(210, 415);
                textBox.setBackground(new Color(0, 0, 0, 0));
                frame.add(textBox);

                JButton enter = new JButton();
                enter.setLayout(null);
                enter.setSize(50, 50);
                enter.setLocation(465, 405);
                enter.setBackground(new Color(0, 0, 0, 0));
                enter.setBorder(null);
                ImageIcon check = new ImageIcon("enter.png");
                Image findImage = check.getImage();
                Image newImage = findImage.getScaledInstance(enter.getWidth(), enter.getHeight(), Image.SCALE_SMOOTH);
                check = new ImageIcon(newImage);
                enter.setIcon(check);
                frame.add(enter);

                JLabel wins = new JLabel();
                wins.setLayout(null);
                wins.setSize(50, 50);
                wins.setLocation(0, 466);
                wins.setBackground(new Color(0, 0, 0, 0));
                wins.setBorder(null);
                ImageIcon wImage = new ImageIcon("crown.png");
                Image getWImage = wImage.getImage();
                Image newWImage = getWImage.getScaledInstance(wins.getWidth(), wins.getHeight(), Image.SCALE_SMOOTH);
                wImage = new ImageIcon(newWImage);
                wins.setIcon(new ImageIcon(newWImage));
                frame.add(wins);

                JLabel wColon = new JLabel(": ");
                wColon.setLayout(null);
                wColon.setSize(50, 50);
                wColon.setLocation(50, 464);
                wColon.setBorder(null);
                wColon.setFont(new Font("Serif", Font.BOLD, 20));
                frame.add(wColon);

                JLabel x = new JLabel();
                x.setLayout(null);
                x.setSize(25, 25);
                x.setLocation(14, 515);
                x.setBackground(new Color(0, 0, 0, 0));
                x.setBorder(null);
                ImageIcon lImage = new ImageIcon("X.png");
                Image getLImage = lImage.getImage();
                Image newLImage = getLImage.getScaledInstance(x.getWidth(), x.getHeight(), Image.SCALE_SMOOTH);
                lImage = new ImageIcon(newLImage);
                x.setIcon(new ImageIcon(newLImage));
                frame.add(x);

                JLabel lColon = new JLabel(": ");
                lColon.setLayout(null);
                lColon.setSize(50, 50);
                lColon.setLocation(50, 500);
                lColon.setBorder(null);
                lColon.setFont(new Font("Serif", Font.BOLD, 20));
                frame.add(lColon);

                String[] Animals = {
                    "Lion",
                    "Cat",
                    "Tiger",
                    "Zebra",
                    "Elephant",
                    "Kangaroo",
                    "Turtle",
                    "Snake",
                    "Gorilla",
                    "Monkey",
                    "Leopard",
                    "Shark",
                    "Whale",
                    "Human",
                    "Cheetah",
                    "Rhino",
                    "Hippo",
                    "Octopus",
                    "Giraff",
                    "Crane"
                };

                String[] Fruits = {
                    "Watermelon",
                    "Orange",
                    "Apple",
                    "Blueberry",
                    "Lemon",
                    "Mango",
                    "Kiwi",
                    "Banana",
                    "Cranberry",
                    "Cherry",
                    "Strawberry",
                    "Grapes",
                    "Coconut",
                    "Pineapple",
                    "Avocados",
                    "Raspberries",
                    "Papaya",
                    "Tangerine",
                    "Plum",
                    "Pear"
                };

                String[] Brands = {
                    "Microsoft",
                    "Apple",
                    "Google",
                    "Pepsi",
                    "Sprite",
                    "Nike",
                    "Twitter",
                    "Adidas",
                    "Visa",
                    "Samsung",
                    "AT&T",
                    "Facebook",
                    "Ebay",
                    "Intel",
                    "BMW",
                    "Lego",
                    "Walmart",
                    "Dell",
                    "Oracle",
                    "FedEx",
                };

                String[] Categories = {
                    "Animals",
                    "Fruits",
                    "Brands"
                };

                int randomCategory = (int)(Math.random() * (Categories.length - 0) + 0);

                JLabel hint = new JLabel("Hint: " + Categories[randomCategory]);
                hint.setLayout(null);
                hint.setSize(500, 500);
                hint.setLocation(180, 240);
                hint.setFont(new Font("Serif", Font.BOLD, 25));
                frame.add(hint);

                int[] attempts = {6};
                JLabel tracker = new JLabel("Attempts: " + attempts[0]);
                tracker.setLayout(null);
                tracker.setSize(500, 500);
                tracker.setLocation(217, 210);
                tracker.setFont(new Font("Serif", Font.BOLD, 15));
                frame.add(tracker);

                JLabel word = new JLabel();
                word.setVisible(false);

                JLabel history = new JLabel("Wrong:");
                history.setLayout(null);
                history.setSize(250, 250);
                history.setLocation(470, 25);
                frame.add(history);

                JLabel implement = new JLabel();
                implement.setLayout(null);
                implement.setSize(250, 250);
                implement.setLocation(445, 50);
                frame.add(implement);

                if (Categories[randomCategory] == "Animals") {
                    int randomAnimal = (int)(Math.random() * (Animals.length - 0) + 0);
                    word.setText((Animals[randomAnimal]).toLowerCase());
                } else if (Categories[randomCategory] == "Fruits") {
                    int randomFruit = (int)(Math.random() * (Fruits.length - 0) + 0);
                    word.setText((Fruits[randomFruit]).toLowerCase());
                } else if (Categories[randomCategory] == "Brands") {
                    int randomBrand = (int)(Math.random() * (Brands.length - 0) + 0);
                    word.setText((Brands[randomBrand]).toLowerCase());
                }

                String[] fetch = {""};

                int[] storage = {0};
                int[] rounds = {1};
                int[] tries = {0};
                int[] lost = {0};
                int[] won = {0};

                System.out.print("\033[H\033[2J");
                System.out.flush();

                for (int i = 1; i <= (word.getText()).length(); i+=1) {
                    if (i <= 1) {
                        System.out.println();
                        System.out.println("Round " + rounds[0] + "#:");
                    }

                    System.out.print(i + ". _" + " ");
                }

                reveal.addActionListener(new ActionListener() {
                    @Override

                    public void actionPerformed(ActionEvent Reveal) {
                        if (tries[0] <= 6) {
                            tries[0] += 1;

                            if (rounds[0] > 0) {
                                for (int i = 0; i <= 5; i+=0) {
                                    if (red[i].isVisible() == true) {
                                        red[i].setVisible(false);
                                    }

                                    i+=1;
                                }
                            }

                            if (tries[0] >= 6) {
                                lost[0] += 1;
                                lColon.setText(": " + lost[0]);

                                tries[0] = 0;

                                if (attempts[0] >= 0 && attempts[0] <= 6) {
                                    attempts[0] = 6;
                                    tracker.setText("Attempts: " + attempts[0]);
                                    storage[0] = 0;
                                    implement.setText(null);
                                }
                            }
                        }

                        if (tries[0] <= 6) {
                            System.out.print("\033[H\033[2J");
                            System.out.flush();

                            String newWord = word.getText();
                            String getLetter = newWord.substring(0, 1).toUpperCase();
                            String getOthers = newWord.substring(1, newWord.length());

                            System.out.println("Previous Answer: " + (getLetter+getOthers));

                            rounds[0] +=1;

                            int newRC = (int)(Math.random() * (Categories.length - 0) + 0);

                            hint.setText("Hint: " + Categories[newRC]);

                            if (Categories[newRC] == "Animals") {
                                int newRA = (int)(Math.random() * (Animals.length - 0) + 0);
                                word.setText((Animals[newRA]).toLowerCase());
                            } else if (Categories[newRC] == "Fruits") {
                                int newRF = (int)(Math.random() * (Fruits.length - 0) + 0);
                                word.setText((Fruits[newRF]).toLowerCase());
                            } else if (Categories[newRC] == "Brands") {
                                int newRB = (int)(Math.random() * (Brands.length - 0) + 0);
                                word.setText((Brands[newRB]).toLowerCase());
                            }

                            lost[0] += 1;
                            lColon.setText(": " + lost[0]);
                            implement.setText(null);

                            if (tries[0] >= 6 && rounds[0] > 0) {
                                for (int i = 0; i <= 5; i+=0) {
                                    if (red[i].isVisible() == true) {
                                        while (red[i].isVisible() == true) {
                                            if (red[i].isVisible() == false) {
                                                break;
                                            }

                                            red[i].setVisible(false);
                                        }
                                    }

                                    i+=1;
                                }
                            }

                            for (int i = 1; i <= (word.getText()).length(); i+=1) {
                                if (i <= 1) {
                                    System.out.println();
                                    System.out.println("Round " + rounds[0] + "#:");
                                }

                                System.out.print(i + ". _" + " ");
                            }
                        }
                    }
                });

                enter.addActionListener(new ActionListener() {
                    @Override

                    public void actionPerformed(ActionEvent Enter) {
                        String textWord = (textBox.getText()).toLowerCase();

                        if (tries[0] <= 6) {
                            if (attempts[0] >= 1 && textWord != word.getText()) {
                                tries[0] += 1;
                                attempts[0] -= 1;
                            }

                            tracker.setText("Attempts: " + attempts[0]);

                            if (tries[0] >= 6) {
                                if (attempts[0] <= 0) {
                                    System.out.print("\033[H\033[2J");
                                    System.out.flush();

                                    String newWord = word.getText();
                                    String getLetter = newWord.substring(0, 1).toUpperCase();
                                    String getOthers = newWord.substring(1, newWord.length());

                                    System.out.println("Previous Answer: " + (getLetter+getOthers));

                                    int newRC = (int)(Math.random() * (Categories.length - 0) + 0);

                                    hint.setText("Hint: " + Categories[newRC]);

                                    if (Categories[newRC] == "Animals") {
                                        int newRA = (int)(Math.random() * (Animals.length - 0) + 0);
                                        word.setText((Animals[newRA]).toLowerCase());
                                    } else if (Categories[newRC] == "Fruits") {
                                        int newRF = (int)(Math.random() * (Fruits.length - 0) + 0);
                                        word.setText((Fruits[newRF]).toLowerCase());
                                    } else if (Categories[newRC] == "Brands") {
                                        int newRB = (int)(Math.random() * (Brands.length - 0) + 0);
                                        word.setText((Brands[newRB]).toLowerCase());
                                    }

                                    rounds[0] += 1;

                                    for (int i = 1; i <= (word.getText()).length(); i+=1) {
                                        if (i <= 1) {
                                            System.out.println();
                                            System.out.println("Round " + rounds[0] + "#:");
                                        }

                                        System.out.print(i + ". _" + " ");
                                    }
                                }

                                lost[0] += 1;
                                lColon.setText(": " + lost[0]);
                                implement.setText(null);

                                if (rounds[0] > 0) {
                                    for (int i = 0; i <= 5; i+=0) {
                                        if (red[i].isVisible() == true) {
                                            while (red[i].isVisible() == true) {
                                                if (red[i].isVisible() == false) {
                                                    break;
                                                }

                                                red[i].setVisible(false);
                                            }
                                        }

                                        i+=1;
                                    }
                                }

                                tries[0] = 0;

                                if (attempts[0] <= 0) {
                                    attempts[0] = 6;
                                    tracker.setText("Attempts: " + attempts[0]);
                                    storage[0] = 0;
                                    implement.setText(null);
                                }
                            }
                        }

                        boolean match = textWord.equals(word.getText());

                        if (textWord.length() == 1) {
                            int NoLetters = 0;
                            int YesLetters = 0;

                            for (int i = 0; i <= (word.getText()).length() - 1; i+=1) {
                                String sub = (word.getText()).substring(i, i + 1);

                                if (!sub.equals(textWord)) {
                                    NoLetters += 1;
                                } else if (sub.equals(textWord)) {
                                    YesLetters += 1;
                                }
                            }

                            for (int i = 0; i <= (word.getText()).length() - 1; i+=1) {
                                String sub = (word.getText()).substring(i, i + 1);

                                if (i <= 0) {
                                    if (NoLetters < (word.getText()).length() && YesLetters > 0) {
                                        System.out.println();
                                    }
                                }

                                if (!sub.equals(textWord)) {
                                    if (NoLetters < (word.getText()).length() && YesLetters > 0) {
                                        System.out.print("_    ");
                                    } else {
                                        fetch[0] = (fetch[0] + " | " + textWord).toUpperCase();
                                        implement.setText(fetch[0]);

                                        if (tries[0] <= 6 && storage[0] <= 5) {
                                            if (red[storage[0]].isVisible() == false) {
                                                red[storage[0]].setVisible(true);

                                                if (attempts[0] >= 6) {
                                                    red[storage[0]].setVisible(false);
                                                }

                                                storage[0]+=1;

                                                if (attempts[0] >= 6) {
                                                    storage[0] = 0;
                                                }
                                            }
                                        }

                                        break;
                                    }
                                } else if (sub.equals(textWord)) {
                                    if (YesLetters > 0 && NoLetters < (word.getText()).length()) {
                                        if (i <= 0) {
                                            System.out.print(textWord.toUpperCase() + "    ");
                                        } else {
                                            System.out.print(textWord + "    ");
                                        }
                                    } else {
                                        if (tries[0] <= 6 && storage[0] <= 5) {
                                            if (red[storage[0]].isVisible() == false) {
                                                red[storage[0]].setVisible(true);

                                                if (attempts[0] >= 6) {
                                                    red[storage[0]].setVisible(false);
                                                }

                                                storage[0]+=1;

                                                if (attempts[0] >= 6) {
                                                    storage[0] = 0;
                                                }
                                            }
                                        }

                                        break;
                                    }
                                }
                            }
                        } else if (textWord.length() > 1) {
                            if (!match) {
                                if (tries[0] <= 6 && storage[0] <= 5) {
                                    if (red[storage[0]].isVisible() == false) {
                                        red[storage[0]].setVisible(true);

                                        if (attempts[0] >= 6) {
                                            red[storage[0]].setVisible(false);
                                        }

                                        storage[0]+=1;

                                        if (attempts[0] >= 6) {
                                            storage[0] = 0;
                                        }
                                    }
                                }
                            } else if (match) {
                                if (tries[0] <= 6 && attempts[0] > 0) {
                                    System.out.print("\033[H\033[2J");
                                    System.out.flush();

                                    String newWord = word.getText();
                                    String getLetter = newWord.substring(0, 1).toUpperCase();
                                    String getOthers = newWord.substring(1, newWord.length());

                                    System.out.println("Previous Answer: " + (getLetter+getOthers));

                                    int newRC = (int)(Math.random() * (Categories.length - 0) + 0);

                                    hint.setText("Hint: " + Categories[newRC]);

                                    if (Categories[newRC] == "Animals") {
                                        int newRA = (int)(Math.random() * (Animals.length - 0) + 0);
                                        word.setText((Animals[newRA]).toLowerCase());
                                    } else if (Categories[newRC] == "Fruits") {
                                        int newRF = (int)(Math.random() * (Fruits.length - 0) + 0);
                                        word.setText((Fruits[newRF]).toLowerCase());
                                    } else if (Categories[newRC] == "Brands") {
                                        int newRB = (int)(Math.random() * (Brands.length - 0) + 0);
                                        word.setText((Brands[newRB]).toLowerCase());
                                    }

                                    rounds[0] += 1;

                                    for (int i = 1; i <= (word.getText()).length(); i+=1) {
                                        if (i <= 1) {
                                            System.out.println();
                                            System.out.println("Round " + rounds[0] + "#:");
                                        }

                                        System.out.print(i + ". _" + " ");
                                    }

                                    won[0] += 1;
                                    wColon.setText(": " + won[0]);

                                    if (rounds[0] > 0) {
                                        for (int i = 0; i <= 5; i+=0) {
                                            if (red[i].isVisible() == true) {
                                                while (red[i].isVisible() == true) {
                                                    if (red[i].isVisible() == false) {
                                                        break;
                                                    }

                                                    red[i].setVisible(false);
                                                }
                                            }

                                            i+=1;
                                        }
                                    }

                                    if (tries[0] > 0 && attempts[0] <= 6) {
                                        tries[0] = 0;
                                        attempts[0] = 6;
                                        tracker.setText("Attempts: " + attempts[0]);
                                        storage[0] = 0;
                                        implement.setText(null);
                                    }
                                }
                            }
                        }
                    }
                });

                frame.setVisible(true);
            }
        });
    }
}
