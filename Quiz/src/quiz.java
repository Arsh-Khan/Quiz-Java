import java.util.*;

public class quiz {
    String name, age;

    void Startquiz() {
        Scanner Scr = new Scanner(System.in);

        System.out.println("\n Press");
        System.out.println(" 1 - General Knowledge Quiz");
        System.out.println(" 2 - Maths Quiz");
        System.out.println("3 - Science Quiz");
        System.out.println("4 - Computer Quiz");
        System.out.println("5 - Instructions");
        System.out.println("6 - Exit");

        int choice = Scr.nextInt();

        do {
            switch (choice) {
                case 1:
                    Gk_quiz1();
                    break;

                case 2:
                    Maths_quiz1();
                    break;

                case 3:
                    Sci_quiz1();
                    break;

                case 4:
                    Comp_quiz1();
                    break;

                case 5:
                    Instructions();
                    break;

                case 6:
                    System.out.println(" You have chosen to Quit the Game");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Wrong Choice");
                    System.out.println("\n Press");
                    System.out.println(" 1 - General Knowledge Quiz");
                    System.out.println(" 2 - Maths Quiz");
                    System.out.println("3 - Science Quiz");
                    System.out.println("4 - Computer Quiz");
                    System.out.println("5 - Instructions");
                    System.out.println("6 - Exit");

                    choice = Scr.nextInt();
            }
        } while (choice != 6);
        Scr.close();
    }

    void Instructions() {
        Scanner Scr = new Scanner(System.in);
        System.out.println("\t \t \t \t \t \t Instructions");
        System.out.println("\n [1] There will be two rounds in the Quiz");
        System.out.println(
                " [2] In the 1st Level , user has to score 7 correct answers out of 10 question , each Question of 1 Point");
        System.out.println(
                "[3] In the second round , there will be 5 Questions with different Points [ Points Will be mentioned with the question] .\n Total score of 20 or more is required to be called a Winner");
        System.out.println(
                "\n Note : Level 2 of Computer Quiz will have \"Hints\" for each question . \n Only 2 hints can be used");
        System.out.println("\n Press:");
        System.out.println(" 1 - Select your Quiz");
        System.out.println(" 2 - Exit");

        int choice = Scr.nextInt();

        do {
            switch (choice) {
                case 1:
                    Startquiz();
                    break;

                case 2:
                    System.out.println("You have chosen to Quit the Game");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Wrong Choice");
                    System.out.println("\n Press:");
                    System.out.println(" 1 - Select your Quiz");
                    System.out.println(" 2 - Exit");

                    choice = Scr.nextInt();
            }
        } while (choice != 2);
        Scr.close();
    }

    void Gk_quiz1() {
        int score = 0;
        Scanner Scr = new Scanner(System.in);
        System.out.println("\t\t\t\t\t General Knowledge Quiz");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\tWelcome :" + name);
        System.out.println("\n Answer the following");
        System.out.println("One Answer for each Question");
        System.out.println("Type A for Option A ......... and so on");
        System.out.println("\n Your Quiz begins now");

        String Q[] = new String[10];
        String OptA[] = new String[10];
        String OptB[] = new String[10];
        String OptC[] = new String[10];
        String OptD[] = new String[10];
        String A[] = new String[10];

        Q[0] = "The velocity of the sound in air [under normal condition] is ";
        OptA[0] = "A - 30 m/s";
        OptB[0] = "B - 320 m/s";
        OptC[0] = "C - 343 m/s";
        OptD[0] = "D - 3320 m/s";
        A[0] = "C";

        Q[1] = "When is the International Workers Day ";
        OptA[1] = "A - 15th April";
        OptB[1] = "B - 12th December";
        OptC[1] = "C - 1st May";
        OptD[1] = "D - 1st August";
        A[1] = "C";

        Q[2] = "Wright Brothers are regarded inventors of";
        OptA[2] = "A - Balloon";
        OptB[2] = "B - Aeroplane";
        OptC[2] = "C - Bicycle";
        OptD[2] = "D - None of the above";
        A[2] = "B";

        Q[3] = "The Ozone Layer restricts";
        OptA[3] = "A - Visible light";
        OptB[3] = "B - Infrared radiation";
        OptC[3] = "C - X-rays and Gamma-rays";
        OptD[3] = "D - Ultraviolet radiation";
        A[3] = "D";

        Q[4] = "The third highest India nation award given for distinguish service in any field is";
        OptA[4] = "A - Padma Bhushan";
        OptB[4] = "B - Padma Vibhushan";
        OptC[4] = "C - Bharat Ratna";
        OptD[4] = "D - Padma Shri";
        A[4] = "A";

        Q[5] = "The World's largest international organisation and a succesor to the League of Nations is ";
        OptA[5] = "A - UNESCO";
        OptB[5] = "B - UNO";
        OptC[5] = "C - UNICEF";
        OptD[5] = "D - ILO";
        A[5] = "B";

        Q[6] = "The trophy known by the name of Grand prix is associated with";
        OptA[6] = " \n A-Table tennis";
        OptB[6] = "\n B-Lawn tennis";
        OptC[6] = "\n C-Both A and B";
        OptD[6] = "\n D-Tabble tennis, lawn tennis and shooting";
        A[6] = "D";

        Q[7] = "When did us astraonauts Neil armstrong and Edwin E.Aldrin land on the moon";
        OptA[7] = "A-July 21 1969";
        OptB[7] = "B-JULY 21 1970";
        OptC[7] = "C-July 21 1963";
        OptD[7] = "D-July 21 1972";
        A[7] = "A";

        Q[8] = " World's busiest airport by passenger traffic is";

        OptA[8] = " \n A - Chicago O'HARE International airport , USA";
        OptB[8] = "\n  B-King Abdul Aziz International airport , Saudi Arabia ";
        OptC[8] = " \n C-Lhasa Airport, Tibet ";
        OptD[8] = " \n D-Harts field - Jackson Atlanta International Airport , USA ";
        A[8] = "D ";

        Q[9] = " To which of the following country Olympic Airlines belong ";

        OptA[9] = "A- France";
        OptB[9] = "B- Indonesia";
        OptC[9] = "C- United Kingdom";
        OptD[9] = "Greece ";
        A[9] = "D";

        for (int i = 0; i < 10; i++) {
            System.out.println(" \n Question:" + Q[i]);
            System.out.print("\t" + OptA[i]);
            System.out.print("\t" + OptB[i]);
            System.out.print("\t" + OptC[i]);
            System.out.print("\t" + OptD[i]);

            System.out.println("\n Enter your Answer");
            String user_ans = (Scr.nextLine()).toUpperCase();

            if (user_ans.charAt(0) == A[i].charAt(0))
                score++;
        }
        System.out.println("Your score is :" + score);

        if (score >= 7) {
            System.out.println("Congratulations, You have qualified for next round");

            System.out.println("\n Press:");
            System.out.println(" 1 - To play Level 2");
            System.out.println(" 2 - To go back to main menu");
            System.out.println(" 3 - Exit");
            int choice = Scr.nextInt();

            do {
                switch (choice) {
                    case 1:
                        Gk_quiz2();
                        break;

                    case 2:
                        Startquiz();
                        break;

                    case 3:
                        System.out.println("You have chosen to Quit the Game");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Wrong Choice");
                        System.out.println("\n Press:");
                        System.out.println(" 1 - To play Level 2");
                        System.out.println(" 2 - Select your Quiz");
                        System.out.println(" 3 - Exit");

                        choice = Scr.nextInt();
                }
            } while (choice != 3);
        } else {
            System.out.println("You did not qualify for Level 2");
            System.out.println("\n Press:");
            System.out.println(" 1 - To go back to the main menu");
            System.out.println(" 2 - Exit");

            int choice = Scr.nextInt();

            do {
                switch (choice) {
                    case 1:
                        Startquiz();
                        break;

                    case 2:
                        System.out.println("You have chosen to Quit the Game");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Wrong Choice");
                        System.out.println("\n Press:");
                        System.out.println(" 1 - To go back to main menu");
                        System.out.println(" 2 - Exit");

                        choice = Scr.nextInt();
                }
            } while (choice != 2);
        }
        Scr.close();
    }

    void Gk_quiz2() {
        int score = 0;
        Scanner Scr = new Scanner(System.in);
        System.out.println("\t\t\t\t\t General Knowledge Quiz Level 2");
        System.out.println("Welcome : " + name);
        System.out.println("\n Answer the following");
        System.out.println("One Answer for each Question");
        System.out.println("Type A for Option A ......... and so on");
        System.out.println("\n Please Note :");
        System.out.println("Each Question carries different points.\n Points will be notified in the Question");
        System.out.println("\n Your Quiz begins now");

        String Q[] = new String[5];
        String OptA[] = new String[5];
        String OptB[] = new String[5];
        String OptC[] = new String[5];
        String OptD[] = new String[5];
        String A[] = new String[5];

        Q[0] = "What is the full form of TNT ? \t[ 3 Points] ";
        OptA[0] = "A - Trinitro";
        OptB[0] = "B - Nitroglycerin";
        OptC[0] = "C - Trinitrotoluene";
        OptD[0] = "D - Picric Acid";
        A[0] = "C";

        Q[1] = "Asia is Subdivided into how many Countries: ? \t[ 3 Points] ";
        OptA[1] = "A - 78 Countries";
        OptB[1] = "B - 24 countries";
        OptC[1] = "C - 102 countries";
        OptD[1] = "D - 48 countries";
        A[1] = "D";

        Q[2] = "Who is the current President of the International Court of Justice ? \t[ 7 Points]";
        OptA[2] = "A - Abdulqawi Ahmed Yusuf";
        OptB[2] = "B - Xue Hanqin";
        OptC[2] = "C - Hisashi Owada";
        OptD[2] = "D - Peter Tomka";
        A[2] = "A";

        Q[3] = "What is the distance between Earth to the newly discovered planet \" Kelper - 186f\" ? \t[ 7 Points]";
        OptA[3] = "A - 200 light years";
        OptB[3] = "B - 990 light years";
        OptC[3] = "C - 490 light years";
        OptD[3] = "D - 2200 light years";
        A[3] = "C";

        Q[4] = "What is the speed of ISS(International Space Station) , when travels in orbiting the Earth ? \t[ 10 Points]";
        OptA[4] = "A - 12500 Km/Hr";
        OptB[4] = "B - 50980 Km/Hr";
        OptC[4] = "C - 10000 Km/Hr";
        OptD[4] = "D - 27600 Km/Hr";
        A[4] = "D";

        for (int i = 0; i < 5; i++) {
            System.out.println(" \n Question:" + Q[i]);
            System.out.print("\t" + OptA[i]);
            System.out.print("\t" + OptB[i]);
            System.out.print("\t" + OptC[i]);
            System.out.print("\t" + OptD[i]);

            System.out.println("\n Enter your Answer");
            String user_ans = (Scr.nextLine()).toUpperCase();

            if (user_ans.charAt(0) == A[i].charAt(0)) {
                if (i == 0 || i == 1)
                    score = score + 3;

                else if (i == 2 || i == 3)
                    score = score + 7;

                else
                    score = score + 10;
            }
        }
        System.out.println("Your score is :" + score);

        if (score >= 20)

            System.out.println("Congratulations, You have been declared as General Knowledge Quiz Winner");

        else
            System.out.println(" Sorry , You did not qualify in level 2.\n Better Luck next time");
        System.out.println("\n Press:");

        System.out.println(" 1 - To go back to main menu");
        System.out.println(" 2 - Exit");
        int choice = Scr.nextInt();

        do {
            switch (choice) {

                case 1:
                    Startquiz();
                    break;

                case 2:
                    System.out.println("You have chosen to Quit the Game");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Wrong Choice");
                    System.out.println("\n Press:");

                    System.out.println(" 1 -To go back to the main menu ");
                    System.out.println(" 2 - Exit");

                    choice = Scr.nextInt();
            }
        } while (choice != 2);
        Scr.close();
    }

    void Maths_quiz1() {
        int score = 0;
        Scanner Scr = new Scanner(System.in);
        System.out.println("\t\t\t\t\t Maths Quiz");
        System.out.println("Welcome :" + name);
        System.out.println("\n Answer the following");
        System.out.println("One Answer for each Question");
        System.out.println("Type A for Option A ......... and so on");
        System.out.println("\n Your Quiz begins now");

        String Q[] = new String[10];
        String OptA[] = new String[10];
        String OptB[] = new String[10];
        String OptC[] = new String[10];
        String OptD[] = new String[10];
        String A[] = new String[10];

        Q[0] = "What is 3 multiplied by itself 4 times ";
        OptA[0] = "A - 1120";
        OptB[0] = "B - 81";
        OptC[0] = "C - 60";
        OptD[0] = "D - 100";
        A[0] = "B";

        Q[1] = "In which Civilization dot patterns were first employed to represent numbers ";
        OptA[1] = "A - Chinese";
        OptB[1] = "B - Russian";
        OptC[1] = "C - Arabian";
        OptD[1] = "D - Indian";
        A[1] = "A";

        Q[2] = "In which numerals [ X ; M ; V] etc belongs to";
        OptA[2] = "A - Roman numerals";
        OptB[2] = "B - Indian numerals";
        OptC[2] = "C - Chinese numerals";
        OptD[2] = "D - Arabian numerals";
        A[2] = "A";

        Q[3] = "If there are 327 Apples and you take 42; how many apples do you have";
        OptA[3] = "A - 285";
        OptB[3] = "B - 42";
        OptC[3] = "C - 369";
        OptD[3] = "D - None of the above";
        A[3] = "B";

        Q[4] = "Divide 50 by half and add 20";
        OptA[4] = "A - 45";
        OptB[4] = "B - 22";
        OptC[4] = "C - 120";
        OptD[4] = "D - 100";
        A[4] = "C";

        Q[5] = "Which is believed to be the most ancient device used for calculation purpose ";
        OptA[5] = "A - Calculator";
        OptB[5] = "B - Proccesor";
        OptC[5] = "C - Abacus";
        OptD[5] = "D - None of the above";
        A[5] = "C";

        Q[6] = "If, you sleep 8 hours a night, how many awake hours are you left with in a week";
        OptA[6] = "A - 78";
        OptB[6] = "B - 100";
        OptC[6] = "C - 196";
        OptD[6] = "D - 112";
        A[6] = "D";

        Q[7] = "What is the next number \t [10,5,30,15,90,?]";
        OptA[7] = "A - 20";
        OptB[7] = "B - 45";
        OptC[7] = "C - 60";
        OptD[7] = "D - 100";
        A[7] = "B";

        Q[8] = " If 1=5 ; 2=25 ; 3=325 ; 4=4325 ; 5=?";

        OptA[8] = " A - 54325";
        OptB[8] = " B - 525 ";
        OptC[8] = " C - 1";
        OptD[8] = " D - None of the above";
        A[8] = "C ";

        Q[9] = " Zephirum , Iziphra , Cenero , Sifr are different names of _____? ";

        OptA[9] = "A - One";
        OptB[9] = "B - Ten";
        OptC[9] = "C - Hundred";
        OptD[9] = "D - Zero ";
        A[9] = "D";

        for (int i = 0; i < 10; i++) {
            System.out.println(" \n Question:" + Q[i]);
            System.out.print("\t" + OptA[i]);
            System.out.print("\t" + OptB[i]);
            System.out.print("\t" + OptC[i]);
            System.out.print("\t" + OptD[i]);

            System.out.println("\n Enter your Answer");
            String user_ans = (Scr.nextLine()).toUpperCase();

            if (user_ans.charAt(0) == A[i].charAt(0))
                score++;
        }
        System.out.println("Your score is :" + score);

        if (score >= 7) {
            System.out.println("Congratulations, You have qualified for next round");

            System.out.println("\n Press:");
            System.out.println(" 1 - To play Level 2");
            System.out.println(" 2 - To go back to main menu");
            System.out.println(" 3 - Exit");
            int choice = Scr.nextInt();

            do {
                switch (choice) {
                    case 1:
                        Maths_quiz2();
                        break;

                    case 2:
                        Startquiz();
                        break;

                    case 3:
                        System.out.println("You have chosen to Quit the Game");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Wrong Choice");
                        System.out.println("\n Press:");
                        System.out.println(" 1 - To play Level 2");
                        System.out.println(" 2 - To go back to the main menu");
                        System.out.println(" 2 - Exit");

                        choice = Scr.nextInt();
                }
            } while (choice != 3);
        } else {
            System.out.println("You did not qualify for Level 2");
            System.out.println("\n Press:");
            System.out.println(" 1 - To go back to the main menu");
            System.out.println(" 2 - Exit");

            int choice = Scr.nextInt();

            do {
                switch (choice) {
                    case 1:
                        Startquiz();
                        break;

                    case 2:
                        System.out.println("You have chosen to Quit the Game");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Wrong Choice");
                        System.out.println("\n Press:");
                        System.out.println(" 1 - To go back to main menu");
                        System.out.println(" 2 - Exit");

                        choice = Scr.nextInt();
                }
            } while (choice != 2);
        }
        Scr.close();
    }

    void Maths_quiz2() {
        int score = 0;
        Scanner Scr = new Scanner(System.in);
        System.out.println("\t\t\t\t\t Maths Quiz Level 2");
        System.out.println("Welcome :" + name);
        System.out.println("\n Answer the following");
        System.out.println("One Answer for each Question");
        System.out.println("Type A for Option A ......... and so on");
        System.out.println("\n Please Note :");
        System.out.println("Each Question carries different points.\n Points will be notified in the Question");
        System.out.println("\n Your Quiz begins now");

        String Q[] = new String[5];
        String OptA[] = new String[5];
        String OptB[] = new String[5];
        String OptC[] = new String[5];
        String OptD[] = new String[5];
        String A[] = new String[5];

        Q[0] = " How many seconds are there in a day ? \t[ 3 Points] ";
        OptA[0] = "A - 186400 sec";
        OptB[0] = "B - 8640 sec";
        OptC[0] = "C - 3600 sec";
        OptD[0] = "D - 86400 sec";
        A[0] = "D";

        Q[1] = "The average of first 50 numbers is: ? \t[ 3 Points] ";
        OptA[1] = "A - 25.30";
        OptB[1] = "B - 25.5";
        OptC[1] = "C - 25.00";
        OptD[1] = "D - 12.50";
        A[1] = "B";

        Q[2] = "How many times does the number 1 appear from 0 to 100 ? \t[ 7 Points]";
        OptA[2] = "A - 21";
        OptB[2] = "B - 15";
        OptC[2] = "C - 20";
        OptD[2] = "D - 50";
        A[2] = "A";

        Q[3] = " Which ancient phenomenon was employed in ancient times to estimate the heights of the objects? \t[ 7 Points]";
        OptA[3] = "A - By using scales";
        OptB[3] = "B - Shadow cast by the mountain";
        OptC[3] = "C - Shadow cast by a man";
        OptD[3] = "D - Shadow cast by the sun";
        A[3] = "D";

        Q[4] = " A clock strikes once at 1o'clock , twice at 2o'clock , thrice at 3o'clock and so on . \n How many times will it strike at 24 hours ? \t[ 10 Points]";
        OptA[4] = "A - 78";
        OptB[4] = "B - 136";
        OptC[4] = "C - 156";
        OptD[4] = "D - 196";
        A[4] = "C";

        for (int i = 0; i < 5; i++) {
            System.out.println(" \n Question:" + Q[i]);
            System.out.print("\t" + OptA[i]);
            System.out.print("\t" + OptB[i]);
            System.out.print("\t" + OptC[i]);
            System.out.print("\t" + OptD[i]);

            System.out.println("\n Enter your Answer");
            String user_ans = (Scr.nextLine()).toUpperCase();

            if (user_ans.charAt(0) == A[i].charAt(0)) {
                if (i == 0 || i == 1)
                    score = score + 3;

                else if (i == 2 || i == 3)
                    score = score + 7;

                else
                    score = score + 10;
            }
        }
        System.out.println("Your score is :" + score);

        if (score >= 20)

            System.out.println("Congratulations, You have been declared as Maths Quiz Winner");

        else
            System.out.println(" Sorry , You did not qualify in level 2.\n Better Luck next time");
        System.out.println("\n Press:");

        System.out.println(" 1 - To go back to main menu");
        System.out.println(" 2 - Exit");
        int choice = Scr.nextInt();

        do {
            switch (choice) {

                case 1:
                    Startquiz();
                    break;

                case 2:
                    System.out.println("You have chosen to Quit the Game");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Wrong Choice");
                    System.out.println("\n Press:");

                    System.out.println(" 1 -To go back to the main menu ");
                    System.out.println(" 2 - Exit");

                    choice = Scr.nextInt();
            }
        } while (choice != 2);
        Scr.close();
    }

    void Sci_quiz1() {
        int score = 0;
        Scanner Scr = new Scanner(System.in);
        System.out.println("\t\t\t\t\t Science Quiz");
        System.out.println("Welcome : " + name);
        System.out.println("\n Answer the following");
        System.out.println("One Answer for each Question");
        System.out.println("Type A for Option A ......... and so on");
        System.out.println("\n Your Quiz begins now");

        String Q[] = new String[10];
        String OptA[] = new String[10];
        String OptB[] = new String[10];
        String OptC[] = new String[10];
        String OptD[] = new String[10];
        String A[] = new String[10];

        Q[0] = "What is the chemical name of Baking soda ";
        OptA[0] = "A - Sodium Carbonate";
        OptB[0] = "B - Sodium Bicarbonate";
        OptC[0] = "C - Carbonic Acid";
        OptD[0] = "D - Sodium Carbide";
        A[0] = "B";

        Q[1] = "Which Element is a liquid at ordinary temperature ";
        OptA[1] = "A - Mercury";
        OptB[1] = "B - Sodium";
        OptC[1] = "C - Chlorine";
        OptD[1] = "D - Sulphur";
        A[1] = "A";

        Q[2] = "Name the chemical used to make toothpastes white";
        OptA[2] = "A - Titanium Dioxide";
        OptB[2] = "B - Zinc Chloride";
        OptC[2] = "C - Sodium Chloride";
        OptD[2] = "D - Titanium Nitrate";
        A[2] = "A";

        Q[3] = "Fishes are good source of _____";
        OptA[3] = "A - Lipids";
        OptB[3] = "B - Carbohydrates";
        OptC[3] = "C - Fats";
        OptD[3] = "D - Protein";
        A[3] = "D";

        Q[4] = "The process of taking food into the body is called ?";
        OptA[4] = "A - Absorption";
        OptB[4] = "B - Assimilation";
        OptC[4] = "C - Digestion";
        OptD[4] = "D - Ingestion";
        A[4] = "D";

        Q[5] = "Cynobacteria refers to ______? ";
        OptA[5] = "A - Red algae";
        OptB[5] = "B - Blue Green algae";
        OptC[5] = "C - Brown algae";
        OptD[5] = "D - Green algae";
        A[5] = "B";

        Q[6] = "The Father of Medicine is ?";
        OptA[6] = "A - R.H Whittakar";
        OptB[6] = "B - Carolus Linnaeus";
        OptC[6] = "C - Hippocrates";
        OptD[6] = "D - Anton Van Leeuwenhoek";
        A[6] = "C";

        Q[7] = "Force of attraction between the molecule in water exerts _____ ?";
        OptA[7] = "A - Atomic force";
        OptB[7] = "B - Intermolecular forces";
        OptC[7] = "C - Electrostatic forces";
        OptD[7] = "D - Vanderwalls forces";
        A[7] = "B";

        Q[8] = " The frequency which is not audible to the Human Ear ?";

        OptA[8] = "A - 50Hz";
        OptB[8] = " B - 500Hz ";
        OptC[8] = " C - 5000Hz ";
        OptD[8] = " D - 50000Hz ";
        A[8] = "D ";

        Q[9] = " Calcium oxide otherwise known as ? ";

        OptA[9] = "A - Caustic Potash";
        OptB[9] = "B - Antacid";
        OptC[9] = "C - Quick Lime";
        OptD[9] = "D - Slaked Lime ";
        A[9] = "C";

        for (int i = 0; i < 10; i++) {
            System.out.println("\n Question:" + Q[i]);
            System.out.print("\t" + OptA[i]);
            System.out.print("\t" + OptB[i]);
            System.out.print("\t" + OptC[i]);
            System.out.print("\t" + OptD[i]);

            System.out.println("\n Enter your Answer");
            String user_ans = (Scr.nextLine()).toUpperCase();

            if (user_ans.charAt(0) == A[i].charAt(0))
                score++;
        }
        System.out.println("Your score is :" + score);

        if (score >= 7) {
            System.out.println("Congratulations, You have qualified for next round");

            System.out.println("\n Press:");
            System.out.println(" 1 - To play Level 2");
            System.out.println(" 2 - To go back to main menu");
            System.out.println(" 3 - Exit");
            int choice = Scr.nextInt();

            do {
                switch (choice) {
                    case 1:
                        Sci_quiz2();
                        break;

                    case 2:
                        Startquiz();
                        break;

                    case 3:
                        System.out.println("You have chosen to Quit the Game");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Wrong Choice");
                        System.out.println("\n Press:");
                        System.out.println(" 1 - To play Level 2");
                        System.out.println(" 2 -To go back to the main menu ");
                        System.out.println(" 3 - Exit");

                        choice = Scr.nextInt();
                }
            } while (choice != 3);
        } else {
            System.out.println("You did not qualify for Level 2");
            System.out.println("\n Press:");
            System.out.println(" 1 - To go back to the main menu");
            System.out.println(" 2 - Exit");

            int choice = Scr.nextInt();

            do {
                switch (choice) {
                    case 1:
                        Startquiz();
                        break;

                    case 2:
                        System.out.println("You have chosen to Quit the Game");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Wrong Choice");
                        System.out.println("\n Press:");
                        System.out.println(" 1 - To go back to main menu");
                        System.out.println(" 2 - Exit");

                        choice = Scr.nextInt();
                }
            } while (choice != 2);
        }
        Scr.close();
    }

    void Sci_quiz2() {
        int score = 0;
        Scanner Scr = new Scanner(System.in);
        System.out.println("\t\t\t\t\t Science Quiz Level 2");
        System.out.println("Welcome :" + name);
        System.out.println("\n Answer the following");
        System.out.println("One Answer for each Question");
        System.out.println("Type A for Option A ......... and so on");
        System.out.println("\n Please Note :");
        System.out.println("Each Question carries different points.\n Points will be notified in the Question");
        System.out.println("\n Your Quiz begins now");

        String Q[] = new String[5];
        String OptA[] = new String[5];
        String OptB[] = new String[5];
        String OptC[] = new String[5];
        String OptD[] = new String[5];
        String A[] = new String[5];

        Q[0] = " Which type of Thermoplastics Can be recycled ? \t[ 3 Points] ";
        OptA[0] = "A - Thermosetting plasics";
        OptB[0] = "B - Thermoplasics";
        OptC[0] = "C - Thermionic plastics";
        OptD[0] = "D - None of the above";
        A[0] = "B";

        Q[1] = "What is Table Sugar ? \t[ 3 Points] ";
        OptA[1] = "A - Sucrose";
        OptB[1] = "B - Glucose";
        OptC[1] = "C - Fructose";
        OptD[1] = "D - Galctose";
        A[1] = "A";

        Q[2] = "\'King of Chemicals\' is _____ ? \t[ 7 Points]";
        OptA[2] = "A - Hydrochloric acid";
        OptB[2] = "B - Nitric acid";
        OptC[2] = "C - Sulphuric acid";
        OptD[2] = "D - Phosphuric acid";
        A[2] = "C";

        Q[3] = "\' The Queen of Drugs\' is known to? \t[ 7 Points]";
        OptA[3] = "A - Penecilin";
        OptB[3] = "B - Bromin";
        OptC[3] = "C - Insulin";
        OptD[3] = "D - Analgin";
        A[3] = "C";

        Q[4] = "Which is the chemical name of \' Chinese Salt\' ? \t[ 10 Points]";
        OptA[4] = "A - Zinc glutamate";
        OptB[4] = "B - Nitroglyceroin";
        OptC[4] = "C - Sodium glutamate";
        OptD[4] = "D - Monosodium glutamate";
        A[4] = "D";

        for (int i = 0; i < 5; i++) {
            System.out.println("\n Question:" + Q[i]);
            System.out.print("\t" + OptA[i]);
            System.out.print("\t" + OptB[i]);
            System.out.print("\t" + OptC[i]);
            System.out.print("\t" + OptD[i]);

            System.out.println("\n Enter your Answer");
            String user_ans = (Scr.nextLine()).toUpperCase();

            if (user_ans.charAt(0) == A[i].charAt(0)) {
                if (i == 0 || i == 1)
                    score = score + 3;

                else if (i == 2 || i == 3)
                    score = score + 7;

                else
                    score = score + 10;
            }
        }
        System.out.println("Your score is :" + score);

        if (score >= 20)

            System.out.println("Congratulations, You have been declared as Science Quiz Winner");

        else
            System.out.println(" Sorry , You did not qualify in level 2.\n Better Luck next time");
        System.out.println("\n Press:");

        System.out.println(" 1 - To go back to main menu");
        System.out.println(" 2 - Exit");
        int choice = Scr.nextInt();

        do {
            switch (choice) {

                case 1:
                    Startquiz();
                    break;

                case 2:
                    System.out.println("You have chosen to Quit the Game");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Wrong Choice");
                    System.out.println("\n Press:");

                    System.out.println(" 1 -To go back to the main menu ");
                    System.out.println(" 2 - Exit");

                    choice = Scr.nextInt();
            }
        } while (choice != 2);
        Scr.close();
    }

    void Comp_quiz1() {
        int score = 0;
        Scanner Scr = new Scanner(System.in);
        System.out.println("\t\t\t\t\t Computer Quiz");
        System.out.println("Welcome : " + name);
        System.out.println("\n Answer the following");
        System.out.println("One Answer for each Question");
        System.out.println("Type A for Option A ......... and so on");
        System.out.println("\n Your Quiz begins now");

        String Q[] = new String[10];
        String OptA[] = new String[10];
        String OptB[] = new String[10];
        String OptC[] = new String[10];
        String OptD[] = new String[10];
        String A[] = new String[10];

        Q[0] = "WWW stands for ";
        OptA[0] = "A - World Worm Web";
        OptB[0] = "B - World Wide Web";
        OptC[0] = "C - World Word Web";
        OptD[0] = "D - None of the above";
        A[0] = "B";

        Q[1] = "Which of the foolowing is a presentation program? ";
        OptA[1] = "A - Ms-Word";
        OptB[1] = "B - Ms-Excel";
        OptC[1] = "C - Ms-PowerPoint";
        OptD[1] = "D - Ms-Access";
        A[1] = "C";

        Q[2] = "ISP stands for _____ ?";
        OptA[2] = "A - International Service Provider";
        OptB[2] = "B - Internet Service Presenter ";
        OptC[2] = "C - Internet Service Portal";
        OptD[2] = "D - Internet Service Provider";
        A[2] = "D";

        Q[3] = "Who invented Compact Disk?";
        OptA[3] = "A - James.T.Russel";
        OptB[3] = "B - J.M.Coetzee";
        OptC[3] = "C - Carles Gabbage";
        OptD[3] = "D - Grace Murry Hopper";
        A[3] = "A";

        Q[4] = "Which is the Operating System of Iphone ?";
        OptA[4] = "A - IOS";
        OptB[4] = "B - Android";
        OptC[4] = "C - Windows";
        OptD[4] = "D - Linux";
        A[4] = "A";

        Q[5] = "GPS was discovered by _____? ";
        OptA[5] = "A - British Army";
        OptB[5] = "B - Japanese Army";
        OptC[5] = "C - Indian Army";
        OptD[5] = "D - US Army";
        A[5] = "D";

        Q[6] = "What is the full form of IMEI ?";
        OptA[6] = "A - International Modulus Equipment Idendity";
        OptB[6] = "B - International Machines Equipment Idendity";
        OptC[6] = "C - Inernational Mobile Equipment Identity";
        OptD[6] = "D - Internet Mobile Equipment Identity";
        A[6] = "C";

        Q[7] = "In which year Microsoft Office was launched ?";
        OptA[7] = "A - 1920";
        OptB[7] = "B - 1989";
        OptC[7] = "C - 1999";
        OptD[7] = "D - 1979";
        A[7] = "B";

        Q[8] = "Full Form of SIM ?";

        OptA[8] = "A - Subscriber Identity Module";
        OptB[8] = " B - Service Identity Module ";
        OptC[8] = " C - Service Integrated Module ";
        OptD[8] = " D - Source Identifier Module ";
        A[8] = "B ";

        Q[9] = " WI-FI stands for ? ";

        OptA[9] = "A - Wireless Function";
        OptB[9] = "B - Wireless Find";
        OptC[9] = "C - Wireless Feature";
        OptD[9] = "D - Wireless Fidelity ";
        A[9] = "D";

        for (int i = 0; i < 10; i++) {
            System.out.println(" \n Question:" + Q[i]);
            System.out.print("\t" + OptA[i]);
            System.out.print("\t" + OptB[i]);
            System.out.print("\t" + OptC[i]);
            System.out.print("\t" + OptD[i]);

            System.out.println("\n Enter your Answer");
            String user_ans = (Scr.nextLine()).toUpperCase();

            if (user_ans.charAt(0) == A[i].charAt(0))
                score++;
        }
        System.out.println("Your score is :" + score);

        if (score >= 7) {
            System.out.println("Congratulations, You have qualified for next round");

            System.out.println("\n Press:");
            System.out.println(" 1 - To play Level 2");
            System.out.println(" 2 - To go back to main menu");
            System.out.println(" 3 - Exit");
            int choice = Scr.nextInt();

            do {
                switch (choice) {
                    case 1:
                        Comp_quiz2();
                        break;

                    case 2:
                        Startquiz();
                        break;

                    case 3:
                        System.out.println("You have chosen to Quit the Game");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Wrong Choice");
                        System.out.println("\n Press:");
                        System.out.println(" 1 - To play Level 2");
                        System.out.println(" 2 -To go back to the main menu ");
                        System.out.println(" 3 - Exit");

                        choice = Scr.nextInt();
                }
            } while (choice != 3);
        } else {
            System.out.println("You did not qualify for Level 2");
            System.out.println("\n Press:");
            System.out.println(" 1 - To go back to the main menu");
            System.out.println(" 2 - Exit");

            int choice = Scr.nextInt();

            do {
                switch (choice) {
                    case 1:
                        Startquiz();
                        break;

                    case 2:
                        System.out.println("You have chosen to Quit the Game");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Wrong Choice");
                        System.out.println("\n Press:");
                        System.out.println(" 1 - To go back to main menu");
                        System.out.println(" 2 - Exit");

                        choice = Scr.nextInt();
                }
            } while (choice != 2);
        }
        Scr.close();
    }

    void Comp_quiz2() {
        int score = 0;
        int h_count = 0;
        Scanner Scr = new Scanner(System.in);
        System.out.println("\t\t\t\t\t Computer Quiz Level 2");
        System.out.println("Welcome :" + name);
        System.out.println("\n Answer the following");
        System.out.println("One Answer for each Question");
        System.out.println("Type A for Option A ......... and so on");
        System.out.println("\n Please Note :");
        System.out.println("Each Question carries different points.\n Points will be notified in the Question");
        System.out.println("This Quiz will have Hints for each question . Only Two Hints can be used.");
        System.out.println("\n Your Quiz begins now");

        String Q[] = new String[5];
        String OptA[] = new String[5];
        String OptB[] = new String[5];
        String OptC[] = new String[5];
        String OptD[] = new String[5];
        String A[] = new String[5];
        String H[] = new String[5];

        Q[0] = " Which programming language is suited to a Structured program ? \t[ 3 Points] ";
        OptA[0] = "A - PL/SQL";
        OptB[0] = "B - Fortan";
        OptC[0] = "C - Basic";
        OptD[0] = "D - Paschal";
        A[0] = "D";
        H[0] = " This language was Invented by Nikalus Wirth";

        Q[1] = "Artifical Intellenge uses ? \t[ 3 Points] ";
        OptA[1] = "A - Fortan";
        OptB[1] = "B - Prolog";
        OptC[1] = "C - C";
        OptD[1] = "D - Cobol";
        A[1] = "B";
        H[1] = " This language is invented in 1972";

        Q[2] = "Dot Matrix is a type of  \t[ 7 Points]";
        OptA[2] = "A - Tape";
        OptB[2] = "B - Printer";
        OptC[2] = "C - Dish";
        OptD[2] = "D - Bus";
        A[2] = "B";
        H[2] = "This device helps us to get a Hard Copy";

        Q[3] = "A device which coonects Human Readable Data into Machine language ? \t[ 7 Points]";
        OptA[3] = "A - Card Reader";
        OptB[3] = "B - Paper Tape";
        OptC[3] = "C - Character Reader";
        OptD[3] = "D - Card Punch ";
        A[3] = "C";
        H[3] = " The device converts ASCII code of each character";

        Q[4] = "ASCII code of Alphabet \'G\' is ? \t[ 10 Points]";
        OptA[4] = "A - 29";
        OptB[4] = "B - 79";
        OptC[4] = "C - 76";
        OptD[4] = "D - 71";
        A[4] = "D";
        H[4] = " The ASCII code Capital A is 65";

        for (int i = 0; i < 5; i++) {
            System.out.println(h_count);
            if (h_count >= 2) {
                System.out.println("\n Question:" + Q[i]);
                System.out.print("\t" + OptA[i]);
                System.out.print("\t" + OptB[i]);
                System.out.print("\t" + OptC[i]);
                System.out.print("\t" + OptD[i]);

                System.out.println("\n Enter your Answer");
                String user_ans = (Scr.next()).toUpperCase();

                if (user_ans.charAt(0) == A[i].charAt(0)) {
                    if (i == 0 || i == 1)
                        score = score + 3;

                    else if (i == 2 || i == 3)
                        score = score + 7;

                    else
                        score = score + 10;
                }
            } else {
                System.out.println(" \n Question:" + Q[i]);
                System.out.print("\t" + OptA[i]);
                System.out.print("\t" + OptB[i]);
                System.out.print("\t" + OptC[i]);
                System.out.print("\t" + OptD[i]);
                System.out.println("\n Press:");
                System.out.println("1 - To answer");
                System.out.println("2 - Hint");
                int choice_1 = Scr.nextInt();

                switch (choice_1) {

                    case 1:
                        System.out.println("\n Enter your Answer");
                        String user_ans = (Scr.next()).toUpperCase();

                        if (user_ans.charAt(0) == A[i].charAt(0)) {
                            if (i == 0 || i == 1)
                                score = score + 3;

                            else if (i == 2 || i == 3)
                                score = score + 7;

                            else
                                score = score + 10;
                        }
                        break;

                    case 2:
                        System.out.println(H[i]);
                        h_count++;
                        System.out.println("\n Enter your Answer");
                        String user_ans1 = (Scr.next()).toUpperCase();

                        if (user_ans1.charAt(0) == A[i].charAt(0)) {
                            if (i == 0 || i == 1)
                                score = score + 3;

                            else if (i == 2 || i == 3)
                                score = score + 7;

                            else
                                score = score + 10;
                        }
                        break;

                    default:
                        System.out.println("Wrong Choice");
                }
            }
        }
        System.out.println("Your score is :" + score);

        if (score >= 20)

            System.out.println("Congratulations, You have been declared as Computer Quiz Winner");

        else
            System.out.println(" Sorry , You did not qualify in level 2.\n Better Luck next time");
        System.out.println("\n Press:");

        System.out.println(" 1 - To go back to main menu");
        System.out.println(" 2 - Exit");
        int choice = Scr.nextInt();

        do {
            switch (choice) {

                case 1:
                    Startquiz();
                    break;

                case 2:
                    System.out.println("You have chosen to Quit the Game");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Wrong Choice");
                    System.out.println("\n Press:");

                    System.out.println(" 1 -To go back to the main menu ");
                    System.out.println(" 2 - Exit");

                    choice = Scr.nextInt();
            }
        } while (choice != 2);
        Scr.close();
    }

    public void main(String args []) {
        Scanner Scr = new Scanner(System.in);
        int choice;

        System.out.println("\t\t\t\t\t\t\t Quiz Competition");
        System.out.println("\n \t\t\t\t\t\t\t Disclaimer");
        System.out.println("\t\t\t\t\t\t \"This Quiz will check your IQ Level\" ");

        System.out.println("Enter Your name :");
        name = Scr.nextLine();
        System.out.println("Enter Your Age :");
        age = Scr.nextLine();

        System.out.println("Press:");
        System.out.println("1 - Start");
        System.out.println("2 - Exit");
        System.out.println("\n This Quiz was made by Arsh Khan");
        System.out.println("\u00AE COPYRIGHT PROTECTED");

        choice = Scr.nextInt();

        do {
            switch (choice) {
                case 1:
                    Startquiz();
                    break;

                case 2:
                    System.out.println("You have chosen to Quit the game");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Wrong Choice");
                    System.out.println("Press:");
                    System.out.println("1 - Start");
                    System.out.println("2 - Exit");
                    choice = Scr.nextInt();
            }
        } while (choice != 2);
        Scr.close();
    }
}