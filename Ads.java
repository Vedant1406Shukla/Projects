import java.io.*;
import java.util.*;

public class Ads 
{
    public static void main(String[] args) throws IOException 
    {
        System.out.println("WELCOME TO THE WORLD OF QUIZ! LET US SEE HOW FAR YOU CAN GO.");
        System.out.println();
        System.out.println("1. SPORTS");
        System.out.println("2. FOOD & DRINK");
        System.out.println("3. MIXED BAG");
        System.out.println();
        System.out.println("ENTER YOUR CHOICE");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        if (choice == 1) {
            int sc = 0;
            System.out.println("GET READY FOR THE BRAIN STORM");
            System.out.println();
            System.out.println("Which Indian cricketer is popularly called 'Jammy'?");
            System.out.println("#### 1. Sachin Tendulkar ####");
            System.out.println("#### 2. Sourav Ganguly ####");
            System.out.println("#### 3. Yuvraj Singh ####");
            System.out.println("#### 4. Rahul Dravid ####");
            System.out.println("======== ENTER YOUR CHOICE =========");
            int v = input.nextInt();

            if (v == 4) 
            {
                System.out.println("~~~~~~ YOU ARE ON THE RIGHT TRACK! ~~~~~~");
                sc += 50;
                System.out.println("YOUR SCORE IS " + sc);
            } 
            else 
            {
                System.out.println("^^^^^ SORRY! BETTER LUCK NEXT TIME! THE CORRECT ANSWER IS RAHUL DRAVID.^^^^^^^^");
            }
            System.out.println("*** Which is the only cricketer to score a four hundred (not out)?                                            *****");
            System.out.println("#### 1. Ricky Ponting ####");
            System.out.println("#### 2.Jacques Kallis ####");
            System.out.println("#### 3.Brian Lara ####");
            System.out.println("#### 4.Chris Harris ####");
            System.out.println("====== ENTER YOUR CHOICE ========");
            int a = input.nextInt();
            if (a == 3) 
            {
                System.out.println("~~~~~ YOU ARE ON THE RIGHT TRACK! ~~~~~~");
                sc += 50;
                System.out.println("YOUR SCORE IS " + sc);
            } 
            else 
            {
                System.out.println("^^^^^^^ SORRY! BETTER LUCK NEXT TIME! THE CORRECT ANSWER IS BRIAN LARA.^^^^^^^^^^^");
            }
            
            System.out.println("***** What would the letters PB next to an athlete's name signify? *****");
            System.out.println("#### 1.Post Box ####");
            System.out.println("#### 2.Personal Best ####");
            System.out.println("#### 3.Pin Ball ####");
            System.out.println("#### 4.Play Banned ####");
            System.out.println("======== ENTER YOUR CHOICE ==========");
            int k1 = input.nextInt();
            if (k1 == 2) {
                System.out.println("~~~~~~~ YOU ARE ON THE RIGHT TRACK!~~~~~~");
                sc += 50;
                System.out.println("YOUR SCORE IS " + sc);
            } else {
                System.out.println("^^^^^^^ SORRY! BETTER LUCK NEXT TIME! THE CORRECT ANSWER IS PERSONAL BEST.^^^^^^^^^^^");
            }
            
            System.out.println("***** What is the shortest distance in a track & field event where the runners are allowed to break lanes? ******");
            System.out.println("#### 1.200 m ####");
            System.out.println("#### 2.800m ####");
            System.out.println("#### 3.600 m ####");
            System.out.println("#### 3.400 m ####");
            System.out.println("======== ENTER YOUR CHOICE ==========");
int r = input.nextInt();
if (r == 2) {
    System.out.println("~~~~~ YOU ARE ON THE RIGHT TRACK! ~~~~~~");
    sc += 50;
    System.out.println("YOUR SCORE IS " + sc);
} else {
    System.out.println("^^^^ SORRY! BETTER LUCK NEXT TIME! THE CORRECT ANSWER IS 800m. ^^^^");
}

System.out.println("***** The standard colors of which sporting event are green & purple? *****");
System.out.println("#### 1. Davis Cup ####");
System.out.println("#### 2. Asia Cup ####");
System.out.println("#### 3. Wimbledon ####");
System.out.println("#### 4. Euro Cup ####");
System.out.println("======== ENTER YOUR CHOICE ==========");
int h1 = input.nextInt();
if (h1 == 3) {
    System.out.println("~~~~~ YOU ARE ON THE RIGHT TRACK! ~~~~~~");
    sc += 50;
    System.out.println("YOUR SCORE IS " + sc);
} else {
    System.out.println("^^^^ SORRY! BETTER LUCK NEXT TIME! THE CORRECT ANSWER IS WIMBLEDON. ^^^^^");
}

System.out.println("***** The Olympic gold medal consists 5.2% of which metal? *****");
System.out.println("#### 1. Gold ####");
System.out.println("#### 2. Platinum ####");
System.out.println("#### 3. Silver ####");
System.out.println("#### 4. Copper ####");
System.out.println("======== ENTER YOUR CHOICE ==========");
int z = input.nextInt();
if (z == 1) {
    System.out.println("~~~~~ YOU ARE ON THE RIGHT TRACK! ~~~~~~");
    sc += 50;
    System.out.println("YOUR SCORE IS " + sc);
}
 else 
{
System.out.println("^^^^ SORRY! BETTER LUCK NEXT TIME! THE CORRECT ANSWER IS GOLD. ^^^^^");
} 
System.out.println("***** Which of these games is officially played only by girls? *****");
System.out.println("#### 1. Volleyball ####");
System.out.println("#### 2. Net ball ####");
System.out.println("#### 3. Baseball ####");
System.out.println("#### 4. Lawn tennis ####");
System.out.println("======== ENTER YOUR CHOICE ==========");
int G5 = input.nextInt();
if (G5 == 2) {
    System.out.println("~~~~~~~ YOU ARE ON THE RIGHT TRACK! ~~~~~~");
    sc += 50;
    System.out.println("YOUR SCORE IS " + sc);
} else {
    System.out.println("^^^^ SORRY! BETTER LUCK NEXT TIME! THE CORRECT ANSWER IS NET BALL. ^^^^^");
}

System.out.println("***** Who was the first cricketer to score 1000 Test runs, play 100 Test matches & take 100 Test catches? *****");
System.out.println("#### 1. Garfield Sobers ####");
System.out.println("#### 2. Allan Donald ####");
System.out.println("#### 3. Ian Chappel ####");
System.out.println("#### 4. Kapil Dev ####");
System.out.println("======== ENTER YOUR CHOICE ==========");
int w0 = input.nextInt();
if (w0 == 1) {
    System.out.println("~~~~~~~ YOU ARE ON THE RIGHT TRACK! ~~~~~~");
    sc += 50;
    System.out.println("YOUR SCORE IS " + sc);
} else {
    System.out.println("^^^^ SORRY! BETTER LUCK NEXT TIME! THE CORRECT ANSWER IS GARFIELD SOBERS.^^^^^");
}

System.out.println("***** How many players are there in the game of basket ball? *****");
System.out.println("#### 1. Five ####");
System.out.println("#### 2. Six ####");
System.out.println("#### 3. Eight ####");
System.out.println("#### 4. Eleven ####");
System.out.println("======== ENTER YOUR CHOICE ==========");
int w = input.nextInt();
if (w == 2) {
    System.out.println("~~~~~~~ YOU ARE ON THE RIGHT TRACK! ~~~~~~");
    sc += 50;
    System.out.println("YOUR SCORE IS " + sc);
} else {
    System.out.println("^^^^^ SORRY! BETTER LUCK NEXT TIME! THE CORRECT ANSWER IS SIX. ^^^^^^");
}

System.out.println("%%%%%% FINALLY YOU HAVE SCORED " + sc + " POINTS");

if (sc < 200) {
    System.out.println("!!!!! SORRY! WE DON'T HAVE A PRIZE FOR YOU");
} else if (sc >= 200 && sc < 400) {
    System.out.println("#### CONGRATULATIONS! YOU WIN A BIG GRAND KINETIC BOSS WITHOUT TYRES. HURRAY! ####");
} else if (sc > 400 && sc <= 500) {
    System.out.println("%%%%%%%%% CONGRATULATIONS! YOU WIN A LIFE LONG TRIP TO YOUR HOME. LUCKY GUY! %%%%%%%%");
}
}
else 
{
    if (choice == 2) {
        int sc = 0;
        System.out.println("***** What is common to the following: bangalpalli, safeda, chausa, langda, malda? *****");
        System.out.println("#### 1. Apple ####");
        System.out.println("#### 2. Mango ####");
        System.out.println("#### 3. Banana ####");
        System.out.println("#### 4. Orange ####");
        System.out.println("======== ENTER YOUR CHOICE ==========");
        int e = input.nextInt();
        if (e == 2) {
            System.out.println("~~~~~~~ YOU ARE ON THE RIGHT TRACK! ~~~~~~");
            sc += 50;
            System.out.println("YOUR SCORE IS " + sc);
        } else {
            System.out.println("^^^^^^^ SORRY! BETTER LUCK NEXT TIME! THE CORRECT ANSWER IS MANGO. ^^^^^^^^");
        }
        System.out.println("****** Which is the most widely cultivated fruit in the world? ******");
        System.out.println("#### 1. Apple ####");
        System.out.println("#### 2. Lemon ####");
        System.out.println("#### 3.Banana ####");
        System.out.println("#### 4.Grapes ####");
    System.out.println("======== ENTER YOUR CHOICE ==========");
int f = input.nextInt();
if (f == 1) {
    System.out.println("~~~~~~~ YOU ARE ON THE RIGHT TRACK! ~~~~~~");
    sc += 50;
    System.out.println("YOUR SCORE IS " + sc);
} else {
    System.out.println("^^^^^ SORRY! BETTER LUCK NEXT TIME! THE CORRECT ANSWER IS APPLE. ^^^^^^");
}

System.out.println("***** Americans call this edible oat meal. How do we refer to it? *****");
System.out.println("#### 1.Soup ####");
System.out.println("#### 2.Sprouts ####");
System.out.println("#### 3.Salad ####");
System.out.println("#### 4.Porridge ####");
System.out.println("======== ENTER YOUR CHOICE ==========");
int l = input.nextInt();
if (l == 4) {
    System.out.println("~~~~~~~ YOU ARE ON THE RIGHT TRACK! ~~~~~~");
    sc += 50;
    System.out.println("YOUR SCORE IS " + sc);
} else {
    System.out.println("^^^^ SORRY! BETTER LUCK NEXT TIME! THE CORRECT ANSWER IS PORRIDGE. ^^^^^");
}

System.out.println("***** Which country is considered the birth place of pizza? *****");
System.out.println("#### 1.France ####");
System.out.println("#### 2.Italy ####");
System.out.println("#### 3.Germany ####");
System.out.println("#### 4.Greece ####");
System.out.println("======== ENTER YOUR CHOICE ==========");
int g = input.nextInt();
if (g == 2) {
    System.out.println("~~~~~~~ YOU ARE ON THE RIGHT TRACK! ~~~~~~");
    sc += 50;
    System.out.println("YOUR SCORE IS " + sc);
}
System.out.println("^^^^^ SORRY! BETTER LUCK NEXT TIME! THE CORRECT ANSWER IS ITALY. ^^^^^^");

System.out.println("***** If bombay is well known for its halwa and calcutta for its rossogollas, what sweet is delhi famous for? *****");
System.out.println("#### 1. Laddoos ####");
System.out.println("#### 2. Peda ####");
System.out.println("#### 3. Jalebi ####");
System.out.println("#### 4. Burfi ####");
System.out.println("======== ENTER YOUR CHOICE ==========");
int x = input.nextInt();
if (x == 1) {
    System.out.println("~~~~~~~ YOU ARE ON THE RIGHT TRACK! ~~~~~~");
    sc += 50;
    System.out.println("YOUR SCORE IS " + sc);
} else {
    System.out.println("^^^^ SORRY! BETTER LUCK NEXT TIME! THE CORRECT ANSWER IS LADDOOS. ^^^^^");
}

System.out.println("***** Which fruit is normally used to make meat tender? *****");
System.out.println("#### 1. Banana ####");
System.out.println("#### 2. Papaya ####");
System.out.println("#### 3. Apple ####");
System.out.println("#### 4. Cherry ####");
System.out.println("======== ENTER YOUR CHOICE ==========");
int g6 = input.nextInt();
if (g6 == 2) {
    System.out.println("~~~~~~~ YOU ARE ON THE RIGHT TRACK! ~~~~~~");
    sc += 50;
    System.out.println("YOUR SCORE IS " + sc);
} else {
    System.out.println("^^^^^ SORRY! BETTER LUCK NEXT TIME! THE CORRECT ANSWER IS PAPAYA. ^^^^^^");
}

System.out.println("***** Which is the only family of food that does not ripen after plucking? *****");
System.out.println("#### 1. Litchi ####");
System.out.println("#### 2. Orange ####");
System.out.println("#### 3. Strawberry ####");
System.out.println("#### 4. Cherry ####");
System.out.println("======== ENTER YOUR CHOICE ==========");
int ch = input.nextInt();
if (ch == 2) {
    System.out.println("~~~~~~~ YOU ARE ON THE RIGHT TRACK! ~~~~~~");
    sc = sc + 50;
    System.out.println("YOUR SCORE IS " + sc);
} else {
    System.out.println("^^^^^ SORRY! BETTER LUCK NEXT TIME! THE CORRECT ANSWER IS ORANGE. ^^^^^^");
}

System.out.println("**** They are called Golguppas in delhi and Puchkas in Calcutta. What are they referred to as in Mumbai? *****");
System.out.println("#### 1. Bhelpuri ####");
System.out.println("#### 2. Aloo chat ####");
System.out.println("#### 3. Panipuri ####");
System.out.println("#### 4. Chana Bhatura ####");
System.out.println("======== ENTER YOUR CHOICE ==========");
int re = input.nextInt();
if (re == 3) {
    System.out.println("~~~~~~~ YOU ARE ON THE RIGHT TRACK! ~~~~~~");
    sc = sc + 50;
    System.out.println("YOUR SCORE IS " + sc);
} else {
    System.out.println("^^^^^^^^^ SORRY! BETTER LUCK NEXT TIME! THE CORRECT ANSWER IS PANIPURI. ^^^^^^^");
}

System.out.println("%%%%% FINALLY YOU HAVE SCORED=" + sc + " POINTS %%%%%");

if (sc < 200) {
    System.out.println("!!!!!!! SORRY! WE DON'T HAVE A PRIZE FOR YOU");
} else if (sc >= 200 && sc <= 400) {
    System.out.println("#### CONGRATULATIONS! YOU WIN A BIG GRAND KINETIC BOSS WITHOUT TYRES. HURRAY! ########");
} else if (sc > 400 && sc <= 500) {
    System.out.println("%%%%%%%%% CONGRATULATIONS! YOU WIN A LIFE LONG TRIP TO YOUR HOME. LUCKY GUY! %%%%%%%%%");
}

} else {
    if (choice == 3) {
        int sc = 0;
        System.out.println("***** Something beautiful for god'is a book by Malcolm Muggeridge. Who is the subject of this book? *****");
        System.out.println("#### 1. Mother Teresa ####");
System.out.println("#### 2. Arundhati Roy ####");
System.out.println("#### 3. Ameliya Arhart ####");
System.out.println("#### 4. Rabindranath Tagore ####");
System.out.println("======== ENTER YOUR CHOICE ==========");
int h1 = input.nextInt();
if (h1 == 1) {
    System.out.println("~~~~~~~ YOU ARE ON THE RIGHT TRACK! ~~~~~~");
    sc = sc + 50;
    System.out.println("YOUR SCORE IS " + sc);
} else {
    System.out.println("^^^^^^^^^^ SORRY! BETTER LUCK NEXT TIME! THE CORRECT ANSWER IS MOTHER TERESA.^^^^^^^^");
}

System.out.println("***** Which Indian has the most number of roads named after him? *****");
System.out.println("#### 1. Mahatma Gandhi ####");
System.out.println("#### 2. B.R. Ambedkar ####");
System.out.println("#### 3. Subhash Chandra Bose ####");
System.out.println("#### 4. Jawahar Lal Nehru ####");
System.out.println("======== ENTER YOUR CHOICE ==========");
int opt = input.nextInt();
if (opt == 1) {
    System.out.println("~~~~~~~ YOU ARE ON THE RIGHT TRACK! ~~~~~~");
    sc = sc + 50;
    System.out.println("YOUR SCORE IS " + sc);
} else {
    System.out.println("^^^^^ SORRY! BETTER LUCK NEXT TIME! THE CORRECT ANSWER IS MAHATMA GANDHI. ^^^^^");
}

System.out.println("****** If an Indian army officer has three stars on his car plate, what is his rank? *****");
System.out.println("#### 1. Captain ####");
System.out.println("#### 2. Brigadier ####");
System.out.println("#### 3. Lieutenant general ####");
System.out.println("#### 4. Major ####");
System.out.println("======== ENTER YOUR CHOICE ==========");
int flag = input.nextInt();
if (flag == 3) {
    System.out.println("~~~~~~~ YOU ARE ON THE RIGHT TRACK! ~~~~~~");
    sc = sc + 50;
    System.out.println("YOUR SCORE IS " + sc);
}
System.out.println("^^^^^ SORRY!BETTER LUCK NEXT TIME! THE CORRECT ANSWER IS LIEUTENANT GENERAL. ^^^^^^^");
System.out.println("***** Who made his film debut in 'Saat Hindustani'? *****");
System.out.println("#### 1.Dharmendra ####");
System.out.println("#### 2.Amitabh Bachchan #### ");
System.out.println("#### 3.Rajesh Khanna ####");
System.out.println("#### 4.Jitendra ####");
System.out.println("========= ENTER YOUR CHOICE ========");
int option = input.nextInt();

if (option == 2) {
    System.out.println("~~~~~~~ YOU ARE ON THE RIGHT TRACK! ~~~~~~");
    sc = sc + 50;

    System.out.println("YOUR SCORE IS " + sc);
} 
else 
{
    System.out.println("^^^^^^^^ SORRY!BETTER LUCK NEXT TIME THE CORRECT ANSWER IS AMITABH BACHCHAN. ^^^^^^");
}    
    System.out.println("***** What did Charlie Chaplin always carry in his hand? *****");
    System.out.println("#### 1.Stick ####");
    System.out.println("#### 2.Bag #### ");
    System.out.println("####3.Hat ####");
    System.out.println("#### 4.Cartoon mask ####");
    System.out.println("======= ENTER YOUR CHOICE ==========");
    int max = input.nextInt();
    if (max == 1) {
        System.out.println("~~~~~~~ YOU ARE ON THE RIGHT TRACK! ~~~~~~");
        sc = sc + 50;
        System.out.println("YOUR SCORE IS " + sc);
    } 
    else 
    {
        System.out.println("^^^^ SORRY!BETTER LUCK NEXT TIME!THE CORRECT ANSWER IS STICK.^^^^^");
    }
    System.out.println("***** What everyday kitchen item can be used to remove ball point stains? *****");
    System.out.println("#### 1.Water ####");
    System.out.println("####2.Salt ####");
    System.out.println("#### 3.Sugar ####");
    System.out.println("####4.Milk ####");
    System.out.println("=========== ENTER YOUR CHOICE ========");
int min = input.nextInt();
if (min == 4) {
    System.out.println("~~~~~~~ YOU ARE ON THE RIGHT TRACK! ~~~~~~");
    sc = sc + 50;
    System.out.println("YOUR SCORE IS " + sc);
} else {
    System.out.println("^^^^^^^^ SORRY!BETTER LUCK NEXT TIME!THE CORRECT ANSWER IS MILK.^^^^^^^^");
}

System.out.println("***** The colour of the highest belt in karate is black. What is the colour of the lowest belt? *****");
System.out.println("#### 1.Red ####");
System.out.println("####2.Blue ####");
System.out.println("####3.White ####");
System.out.println("####4.Yellow ####");
System.out.println("======== ENTER YOUR CHOICE ==========");
int abs = input.nextInt();
if (abs == 3) {
    System.out.println("~~~~~~~ YOU ARE ON THE RIGHT TRACK! ~~~~~~");
    sc = sc + 50;
    System.out.println("YOUR SCORE IS " + sc);
} else {
    System.out.println("^^^^^^^^^ SORRY!BETTER LUCK NEXT TIME!THE CORRECT ANSWER IS WHITE.^^^^^");
}

System.out.println("***** Which river in Europe is referred to as 'W'? *****");
System.out.println("#### 1.Volga ####");
System.out.println("#### 2.Rhine ####");
System.out.println("####3.Siene ####");
System.out.println("####4.Danube ####");
System.out.println("======== ENTER YOUR CHOICE ==========");
int sm = input.nextInt();
if (sm == 4) {
    System.out.println("~~~~~~~ YOU ARE ON THE RIGHT TRACK! ~~~~~~");
    sc = sc + 50;
    System.out.println("YOUR SCORE IS " + sc);
} else {
    System.out.println("^^^^ SORRY!BETTER LUCK NEXT TIME! THE CORRECT ANSWER IS DANUBE. ^^^^^");
}

System.out.println("***** If your mother was a Horticulturist, what would she be interested in? *****");
System.out.println("#### 1.Flowers & Gardening ####");
System.out.println("#### 2.Cosmetics ####");
System.out.println("#### 3.Space ####");
System.out.println("#### 4.Medicine ####");
System.out.println("======== ENTER YOUR CHOICE ==========");
int sg = input.nextInt();
if (sg == 1) {
    System.out.println("~~~~~~~ YOU ARE ON THE RIGHT TRACK! ~~~~~~");
    sc = sc + 50;
    System.out.println("YOUR SCORE IS " + sc);
} else {
    System.out.println("^^^^^ SORRY! BETTER LUCK NEXT TIME! THE CORRECT ANSWER IS FLOWERS AND GARDENING. ^^^^^^");
}

System.out.println("***** Which member of the cat's family is the snake's greatest enemy? *****");
System.out.println("#### 1.Cat ####");
System.out.println("#### 2.Lion ####");
System.out.println("#### 3.Leopard ####");
System.out.println("#### 4.Mongoose ####");
System.out.println("======== ENTER YOUR CHOICE ==========");
int sl = input.nextInt();
if (sl == 4) {
    System.out.println("~~~~~~~ YOU ARE ON THE RIGHT TRACK! ~~~~~~");
    sc = sc + 50;
    System.out.println("YOUR SCORE IS " + sc);
} else {
    System.out.println("^^^^ SORRY! BETTER LUCK NEXT TIME THE CORRECT ANSWER IS MONGOOSE. ^^^^^^");
}

System.out.println("%%%%%%%%%% FINALLY YOU HAVE SCORED=" + sc + " POINTS %%%%%%%");

if (sc < 200) {
    System.out.println("**** SORRY! WE DON'T HAVE A PRIZE FOR YOU ****");
} else if (sc >= 200 && sc <= 400) {
    System.out.println("###### CONGRATULATIONS! YOU WIN A BIG GRAND KINETIC BOSS WITHOUT TYRES. HURRAY! ########");
} else if (sc > 400 && sc <= 500) {
    System.out.println("%%%%%% CONGRATULATIONS! YOU WIN A LIFE LONG TRIP TO YOUR HOME. LUCKY GUY! %%%%%%%%");
} else {
    System.out.println("@@@@@@@ SORRY! WRONG CHOICE @@@@@@@@");
}
}
    }
}
    }
} 