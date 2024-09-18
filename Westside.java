import java.io.*;
import java.util.*;

class Westside {
    double cost = 0;
    double s = 100.0;
    int n = 100;
    int z = 0;
    double disc = 0;
    String name[] = new String[n];
    double price[] = new double[n];

    public static void main(String args[]) throws NoSuchElementException,IOException
    {
        Scanner std = new Scanner(System.in);
        double Billamt = 0;
        String st="";

        while (true) {
            System.out.println("***************WELCOME TO WESTSIDE********* !!!");
            System.out.println("***********************************************************************");
            System.out.println("The Clothing store where all your needs for clothes and a little bit of accessories are fulfilled!!!");
            System.out.println("If you are in for a mood of shopping then... YOU ARE IN THE RIGHT PLACE !");

            Westside obj = new Westside();

            do {
                System.out.println("We allow our customers to shop conveniently and provide them a wide variety of choices to choose from.");
                System.out.println("The choices are \n 1. Women's Wear");
                System.out.println("2.Men's Wear \n 3.Surprise Section! \n 4. Kids Wear\n 5. Accessories");
                System.out.println("and 6.Shoes.");
                System.out.println("Enter your choice");

                int c = std.nextInt();

        switch (c) {
case 1:
    obj.Women();
    break;
case 2:
    obj.Men();
    break;
case 3:
    obj.Surprise();
    break;

case 4:
    obj.Kids();
    break;

case 5:
    obj.Accessories();
    break;

case 6:
    obj.Shoes();
    break;

default:
    System.out.println("Please check your input");
}
System.out.println("Please type 'stop' if you want to stop");
System.out.println("Type anything else if you want to continue shopping.");
st = std.next();
} //end of do
while (!(st.equalsIgnoreCase("stop")));
// computing and printing the bill

System.out.println("Your Bill :");
System.out.println("Sl.no \t Item name \t \t \t \t Cost of the Item");
for (int i = 0; i < obj.z; i++) {
    System.out.println(i + 1 + "\t" + obj.name[i] + "\t \t \t \t " + obj.price[i]);
}

Billamt = obj.cost + Billamt; // to compute the total billamount
System.out.println("Total cost to be paid = " + Billamt);
System.out.println("Hope you enjoyed shopping! and please do come back soon !");
System.out.println("Are there any more customers?");
System.out.println("Enter No if there are no more customers");
String str = std.next();
if (str.equalsIgnoreCase("No")) {
    System.exit(0);
}
} //end of while
}//end of main function

public void Women() throws NoSuchElementException,IOException {
    Scanner std = new Scanner(System.in);
    System.out.println("Welcome to the Womens' clothing section !!!");
    System.out.println("We provide a wide range of selections. So");
    System.out.println("kindly enter the numbers as given in the menu.");
    System.out.println("Enter \n1. for Ethnic Wear \n2. for Casual Wear");
    System.out.println("3. for formal Wear and \n4. for Western Wear \n5.Party Wear.");
    System.out.println("We are extremely delighted to announce that");
    System.out.println("we provide 15% discount in the Casual Wear section and 25% discount");
    System.out.println("on all sections in the Party Wear !");
    int chwo = std.nextInt();

    switch (chwo) {
        case 1:
            System.out.println("This is the Ethnic");
            System.out.println("section and we are very glad to announce that the latest designs");
            System.out.println("have just come in!!");
            System.out.println("The Ethnic section provides you with its own varieties.");
            System.out.println("We also provide sizes ranging from Small(s), Medium(m),");
            System.out.println("Large(l) and Extra Large(XL).");
            System.out.println("Please enter the numbers according to your choice");
            System.out.println("Enter \n1. for Saree");
            System.out.println("2. for Pattiyallas \n3. for Chuddidhars \n4. for Salwars Kameez and");
            System.out.println("5. for Kurtis \n6. for ghagras.");

int num = std.nextInt(); // asking for users choice

if (num == 1) {
    name[z] = "Saree";
    price[z] = 900;
    z++;
    System.out.println("The cost for your choice is Rs 900");
    cost = cost + 900;
} else if (num == 2) {
    name[z] = "Pattiyallas";
    price[z] = 500;
    z++;
    System.out.println("The cost for your choice is Rs 500");
    cost = cost + 500;
} else if (num == 3) {
    name[z] = "Chuddidhars";
    price[z] = 400;
    z++;
    System.out.println("The cost for your choice is Rs 400");
    cost = cost + 400;
} else if (num == 4) {
    name[z] = "Salwar Kameez";
    price[z] = 650;
    z++;
    System.out.println("The cost for your choice is Rs 650");
    cost = cost + 650;
} else if (num == 5) {
    name[z] = "Kurtis";
    price[z] = 150;
    z++;
    System.out.println("The cost for your choice is Rs 150");
cost = cost + 150;
} else if (num == 6) {
    name[z] = "Ghagras";
    price[z] = 550;
    z++;
    System.out.println("The cost for your choice is Rs 550");
    cost = cost + 550;
} else 
    System.out.println("Please check your input");
    break;
case 2:
    System.out.println("This is the Casual Wear section and we are very glad to announce that we have received the latest designs");
    System.out.println("The Casual Wear section provides you with wide varieties");
    System.out.println("We also provide sizes ranging from Small(s), Medium(m), Large(l) and Extra Large(XL)");
    System.out.println("Please enter the numbers according to your choice");
    System.out.println("Enter \n1.for Casual pants \n2. for Casual shirts/t-shirts \n3. for Casual skirts");
    System.out.println("\n4. for sweaters/jackets \n5.for Dresses");
    num = std.nextInt();
    if (num == 1) {
        disc = 599 - (0.15 * 599);
        name[z] = "Casual pants";
        price[z] = disc;
        z++;
        cost = cost + disc;
        System.out.println("The cost for your choice is Rs 599 but after discount it is Rs " + disc);
    } else if (num == 2) {
        disc = 399 - (0.15 * 399);
        name[z] = "Casual shirts/t-shirts";
        price[z] = disc;
        z++;
        cost = cost + disc;
    }
        else if (num == 3) {
            disc = 499 - (0.15 * 499);
            name[z] = "Casual skirts";
            price[z] = disc;
            z++;
            cost = cost + disc;
            System.out.println("The cost for your choice is Rs 499 but after discount it is Rs " + disc);
        } else if (num == 4) {
            disc = 299 - (0.15 * 299);
            name[z] = "Sweater/Jackets";
            price[z] = disc;
            z++;
            cost = cost + disc;
            System.out.println("The cost for your choice is Rs 299 but after discount it is Rs " + disc);
        } else if (num == 5) {
            disc = 750 - (0.15 * 750);
            name[z] = "Dresses";
            price[z] = disc;
            z++;
            cost = cost + disc;
            System.out.println("The cost for your choice is Rs 750 but after discount it is Rs " + disc);
        } 
        else 
            System.out.println("Please check your input");
            break;
        
        case 3:
            System.out.println("This is the Formal Wear section and we are very glad to announce that");
            System.out.println("we have received the designs.");
            System.out.println("The Formal Wear section provides you with wide varieties.");
            System.out.println("We also provide sizes ranging from Small(s), Medium(m), Large(l) and Extra Large(XL).");
            System.out.println("Please enter the numbers according to your choice");
            System.out.println("Enter \n1.for Formal pants \n2. for Formal skirts \n3. for Formal shirts/t-shirts \n4. for Coats.");
            num = std.nextInt();

if (num == 1) {
    name[z] = "Formal pants";
    price[z] = 599;
    z++;
    System.out.println("The cost for your choice is Rs 599");
    cost = cost + 599;
} else if (num == 2) {
    name[z] = "Formal shirts/t-shirts";
    price[z] = 399;
    z++;
    System.out.println("The cost for your choice is Rs 399");
    cost = cost + 399;
} else if (num == 3) {
    name[z] = "Formal skirts";
    price[z] = 499;
    z++;
    System.out.println("The cost for your choice is Rs 499");
    cost = cost + 499;
} else if (num == 4) {
    name[z] = "Coats";
    price[z] = 350;
    z++;
    System.out.println("The cost for your choice is Rs 350");
    cost = cost + 350;
} else 
    System.out.println("Please check your input");
    break;
case 4:
    System.out.println("This is the Western Wear section and we are very glad to announce that we have received");
    System.out.println("the latest designs.");
    System.out.println("The Western Wear section provides you with wide varieties form the Western sides itself.");
    System.out.println("We also provide sizes ranging from Small(s), Medium(m), Large(l) and Extra Large(XL).");
    System.out.println("Please enter the numbers according to your choice.");
    System.out.println("Enter 1.for Jeans(Denim) 2. for fancy tops (Sleeveless, Halter necked, Full sleeves etc.");
    num = std.nextInt();
    if (num == 1) {
        name[z] = "Jeans(Denim)";
        price[z] = 299;
        z++;
        System.out.println("The cost for your choice is Rs 299");
        cost = cost + 299;
    } else if (num == 2) {
        name[z] = "fancy tops (Sleeveless, Halter necked, Full sleeves)";
        price[z] = 199;
        z++;
        System.out.println("The cost for your choice is Rs 199");
        cost = cost + 199;
    } else 
        System.out.println("Please check your input");
        break;
    case 5:
        System.out.println("This is the Party Wear section!");
        System.out.println("The Party Wear section provides you with amazing varieties of choices to choose from.");
        System.out.println("We also provide sizes ranging from Small(s), Medium(m), Large(l) and Extra Large(XL).");
        System.out.println("Please enter the numbers according to your choice.");
        System.out.println("Enter \n1. Cocktail Dresses \n2. for Disco Dresses \n3. for Strapless Dresses.");
        num = std.nextInt();
    
        if (num == 1) {
            disc = 1000 - (0.25 * 1000);
            cost = cost + disc;
            name[z] = "Cocktail Dresses";
            price[z] = disc;
            z++;
            System.out.println("The cost for your choice is Rs 1000 but after discount it is Rs " + cost);
        } else if (num == 2) {
            disc = 1500 - (0.25 * 1500);
            cost = cost + disc;
            name[z] = "Disco Dresses";
            price[z] = disc;
            z++;
            System.out.println("The cost for your choice is Rs 1500 but after discount it is Rs " + cost);
        }
        else if (num == 3) {
            disc = 2500 - (0.25 * 2500);
            cost = cost + disc;
            name[z] = "Strapless Dress";
            price[z] = disc;
            z++;
            System.out.println("The cost for your choice is Rs 2500 but after discount it is Rs " + cost);
        } else
            System.out.println("Please check your input");
            break;
        
        default:
            System.out.println("Please check your Input");
        }
        std.close();
        }//end of function Women
        
        public void Men() throws NoSuchElementException,IOException {
            Scanner std = new Scanner(System.in);
        
            System.out.println("Welcome to the Mens' clothing section !!!");
            System.out.println("We provide a wide range of selections");
            System.out.println("Kindly enter the numbers as given in the menu.");
            System.out.println("Enter \n1. for Ethnic Wear \n2. for Casual Wear");
            System.out.println("\n3. for formal Wear \n4. for Western Wear \n5.for Party Wear.");
            System.out.println("We are extremely delighted to announce that");
            System.out.println("we provide 20% discount on all sections in the Casual Wear! and");
            System.out.println("25% discount on Formal Wear !");
            int chwo = std.nextInt();
        
            switch (chwo) {
                case 1:
                    System.out.println("This is the Ethnic section and we are very glad to announce that");
                    System.out.println("the latest designs have");
                    System.out.println("just come in.");
                    System.out.println("The Ethnic section provides you with its own varieties.");
                    System.out.println("We also provide sizes ranging from Small(s), Medium(m), Large(l) and Extra Large(XL).");
                    System.out.println("Please enter the numbers according to your choice.");
                    System.out.println("Enter \n1. for Kurtas \n2. for Traditional Sherwanis \n3. for Jodhpuri Suit \n4. Kurta Pyjama.");
        
                    int num = std.nextInt();
        
                    if (num == 1) {
                        name[z] = "Kurtas";
                        price[z] = 699;
                        z++;
                        System.out.println("The cost for your choice is Rs 699");
                        cost = cost + 699;
                        } else if (num == 2) {
                            name[z] = "Traditional Sherwanis";
                            price[z] = 1999;
                            z++;
                            System.out.println("The cost for your choice is Rs 1999");
                            cost = cost + 1999;
                        } else if (num == 3) {
                            name[z] = "Jodhpuri Suit";
                            price[z] = 2999;
                            z++;
                            System.out.println("The cost for your choice is Rs 2999");
                            cost = cost + 2999;
                        } else if (num == 4) {
                            name[z] = "Kurta Pyjama";
                            price[z] = 1750;
                            z++;
                            System.out.println("The cost for your choice is Rs 1750");
                            cost = cost + 1750;
                        } else
                            System.out.println("Please check your input");
                            break;
                        case 2:
                            System.out.println("This is the Casual Wear section and we are very glad to announce that we have received the");
                            System.out.println("latest designs.");
                            System.out.println("The Casual Wear section provides you with wide varieties.");
                            System.out.println("We also provide sizes ranging from Small(s), Medium(m), Large(l) and Extra Large(XL).");
                            System.out.println("Please enter the numbers according to your choice.");
                            System.out.println("Enter \n1.for Casual pants \n2. for Casual shirts \n3. for Casual t-shirts \n4. for sweaters/jackets \n5. for Trousers/Shorts.");
                        
                            num = std.nextInt();
                        
                            if (num == 1) {
                                disc = 1000 - (0.20 * 1000);
                                cost = cost + disc;
                                name[z] = "Casual pants";
                                price[z] = disc;
                                z++;
                                System.out.println("The cost for your choice is Rs 1000 but the discounted price is Rs " + disc);
                                } else if (num == 2) {
                                    disc = 750 - (0.20 * 750);
                                    cost = cost + disc;
                                    name[z] = "Casual shirts";
                                    price[z] = disc;
                                    z++;
                                    System.out.println("The cost for your choice is Rs 750 but the discounted price is Rs " + disc);
                                } else if (num == 3) {
                                    disc = 800 - (0.20 * 800);
                                    cost = cost + disc;
                                    name[z] = "Casual t-shirts";
                                    price[z] = disc;
                                    z++;
                                    System.out.println("The cost for your choice is Rs 800 but the discounted price is Rs " + disc);
                                } else if (num == 4) {
                                    disc = 1500 - (0.20 * 1500);
                                    cost = cost + disc;
                                    name[z] = "Sweaters/Jackets";
                                    price[z] = disc;
                                    z++;
                                    System.out.println("The cost for your choice is Rs 1500 but the discounted price is Rs " + disc);
                                } else if (num == 5) {
                                    disc = 1250 - (0.20 * 1250);
                                    cost = cost + disc;
                                    name[z] = "Trousers/shorts";
                                    price[z] = disc;
                                    z++;
                                    System.out.println("The cost for your choice is Rs 1250 but the discounted price is Rs " + disc);
                                }
                                 else 
                                 System.out.println("Please check your input");
                                 break;

                                 case 3:
                                     System.out.println("This is the Formal Wear section and we are very glad to announce that we have received the latest designs.");
                                     System.out.println("The Formal Wear section provides you with wide varieties.");
                                     System.out.println("We also provide sizes ranging from Small(s), Medium(m), Large(l) and Extra Large(XL).");
                                     System.out.println("Please enter the numbers according to your choice.");
                                     System.out.println("Enter \n1.for Formal pants \n2. for Formal shirts \n3. for Suits \n4. for Tuxedoes \n5. for Coats and Blazers.");
                                
                                     num = std.nextInt();
                                 
                                     if (num == 1) {
                                         disc = 1999 - (0.25 * 1999);
                                         cost = cost + disc;
                                         name[z] = "Formal Pants";
                                         price[z] = disc;
                                         z++;
                                         System.out.println("The cost for your choice is Rs 1999 but after calculating discount it is Rs " + disc);
                                     } else if (num == 2) {
                                         disc = 1000 - (0.25 * 1000);
                                         cost = cost + disc;
                                         name[z] = "Formal shirts";
                                         price[z] = disc;
                                         z++;
                                         System.out.println("The cost for your choice is Rs 1000 but after calculating discount it is Rs " + disc);
                                     } else if (num == 3) {
                                         disc = 3999 - (0.25 * 3999);
                                         cost = cost + disc;
                                         name[z] = "Suits";
                                         price[z] = disc;
                                         z++;
                                         System.out.println("The cost for your choice is Rs 3999 but after calculating discount it is Rs " + disc);
                                     } else if (num == 4) {
                                         disc = 3999 - (0.25 * 3999);
                                         cost = cost + disc;
                                         name[z] = "Tuxedoes";
                                         price[z] = disc;
                                         z++;
                                         System.out.println("The cost for your choice is Rs 3999 but after calculating discount it is Rs " + disc);
                                         } else if (num == 5) {
                                             disc = 2950 - (0.25 * 2950);
                                             cost = cost + disc;
                                             name[z] = "Coats and Blazers";
                                             price[z] = disc;
                                             z++;
                                             System.out.println("The cost for your choice is Rs 2950 but after calculating discount it is Rs " + disc);
                                         } 
                                         else 
                                             System.out.println("Please check your input");
                                             break;
                                         case 4:
System.out.println("This is the Western Wear section and we are very glad to announce that we have received the latest designs.");
System.out.println("The Western Wear section provides you with wide varieties form the Western sides itself.");
System.out.println("We also provide sizes ranging from Small(s), Medium(m), Large(l) and Extra Large(XL).");
System.out.println("Please enter the numbers according to your choice.");
System.out.println("Enter \n1.for Jeans(Denim) \n2. Western designed tops.");
                                             num = std.nextInt();
                                         
                                             if (num == 1) {
                                                 name[z] = "Jeans(Denim)";
                                                 price[z] = 499;
                                                 z++;
                                                 System.out.println("The cost for your choice is Rs 499");
                                                 cost = cost + 499;
                                             } else if (num == 2) {
                                                 name[z] = "Western designed tops";
                                                 price[z] = 299;
                                                 z++;
                                                 System.out.println("The cost for your choice is Rs 299");
                                                 cost = cost + 299;
                                             } else 
                                                 System.out.println("Please check your input");
                                                 break;

                                                 case 5:
                                                 System.out.println("This is the Party Wear section!");
                                                 System.out.println("The Party Wear section provides you with amazing varieties of choices to choose from.");
                                                 System.out.println("We also provide sizes ranging from Small(s), Medium(m), Large(l) and Extra Large(XL).");
                                                 System.out.println("Please enter the numbers according to your choice.");
                                                 System.out.println("Enter \n1.for Party Wear Suits \n2. Funky Party Wear Outfits.");
                                                 num = std.nextInt();
                                             
                                                 if (num == 1) {
                                                     System.out.println("The cost for your choice is Rs 2000");
                                                     cost = cost + 2000;
                                                     name[z] = "Party Wear Suits";
                                                     price[z] = 2000;
                                                     z++;
                                                 } else if (num == 2) {
                                                     System.out.println("The cost for your choice is Rs 2500");
                                                     cost = cost + 2500;
                                                     name[z] = "Funky Party Wear Outfits";
                                                     price[z] = 2500;
                                                     z++;
                                                 } else 
                                                     System.out.println("Please check your input");
                                                     break;
                                             default:
                                                 System.out.println("Please check your Input");
                                                }
                                                std.close();
                                             }//end of function Men
                                             public void Surprise() throws NoSuchElementException,IOException 
                                              {
                                                 Scanner std = new Scanner(System.in);
                                             
                                                 System.out.println("Welcome to the Surprise clothing Section !!!");
                                                 System.out.println("This section is solely dedicated to all those young couples out there who have decided to tie the knot.");                                          
                                                 System.out.println("We try to make it special by providing a wide range of Bridal Wear for the Brides and Designer Wear for the Grooms to choose from. So, please enter the number that you want!");                                            
                                                 System.out.println("All you need to do is look around and find the outfit of your size!");                                             
                                                 System.out.println("Enter \n1. for Gowns \n2. for Designer Sarees \n3. for Designer Suits \n4. for Designer Sherwanis.");
                                                 int chwo = std.nextInt();
                                             
                                                 switch (chwo) {
                                                     case 1:
                                                         System.out.println("The cost for your purchase is Rs 5999");
                                                         cost = cost + 5999;
                                                         name[z] = "Gowns";
                                                         price[z] = 5999;
                                                         z++;
                                                         break;
                                                         
                                                         case 2:
                                                             System.out.println("The cost for your purchase is Rs 7999");
                                                             cost = cost + 7999;
                                                             name[z] = "Designer Sarees";
                                                             price[z] = 7999;
                                                             z++;
                                                             break;
                                                         
                                                         case 3:
                                                             System.out.println("The cost for your purchase is Rs 5999");
                                                             cost = cost + 5999;
                                                             name[z] = "Designer Suits";
                                                             price[z] = 5999;
                                                             z++;
                                                             break;
                                                         
                                                         case 4:
                                                             System.out.println("The cost for your purchase is Rs 7999");
                                                             cost = cost + 7999;
                                                             name[z] = "Designer Sherwanis";
                                                             price[z] = 7999;
                                                             z++;
                                                             break;
                                                         
                                                         default:
                                                             System.out.println("Please check your input");
                                                         
                                                         }
                                                         std.close();
                                                    }    
                    public void Kids() throws NoSuchElementException,IOException {
                        Scanner std = new Scanner(System.in);
                    
                     System.out.println("Welcome to the Kids' clothing section !!!");                        
                        System.out.println("We provide a wide range of selections of clothes for your children to choose from.");
                        System.out.println("We have provided certain categories for your kids!");                           
                        System.out.println("The categories are for \n1. 0-12 months (Infants) \n2. 1-6 years \n3. 7-12 years 4. 8-15 years.");
                        System.out.println("Please enter the number of your choice.");
                    
                        int chwo = std.nextInt();
                                                         
                        switch (chwo) {
                            case 1:
                     System.out.println("Welcome to the Infants section and we are very glad to help you choose clothes for your tiny tots!");
                     System.out.println("Please enter the gender of the baby. For example, female or male.");
                    String sex = std.nextLine();
                if (sex.equalsIgnoreCase("female")) {
                 System.out.println("We are very glad to announce all that is in store for your young baby girl.");
                System.out.println("Kindly look around and choose the correct size for your darling!!!");
                System.out.println("Please enter \n1. for skirts/t-shirts \n2. for plain frocks \n3. for frilled frocks!");
            
                int num = std.nextInt();
            
                if (num == 1) {
                     name[z] = "Skirts/t-shirts";
                     price[z] = 299;
                     z++;
                     System.out.println("The cost for your purchase is Rs 299");
                     cost = cost + 299;
                 } else if (num == 2) {
                     name[z] = "Plain Frocks";
                    price[z] = 250;
                    z++;
                     System.out.println("The cost for your purchase is Rs 250");
                    cost = cost + 250;
                } else if (num == 3) {
                    name[z] = "Frilled Frocks";
                     price[z] = 325;
                    z++;
                    System.out.println("The cost for your purchase is Rs 325");
                    cost = cost + 325;
                } else {
                         System.out.println("Please check your input");
                }
            }
            else 
            if (sex.equalsIgnoreCase("male")) {
                 System.out.println("We are very glad to announce all that is in store for your young baby boy.");
                 System.out.println("Kindly look around and choose the correct size for your darling!!!");
                 System.out.println("Please enter \n1. for pants/t-shirts \n2. for shorts/tops!");
                 int num = std.nextInt();
            
                if (num == 1) {
                      name[z] = "Pants/t-shirts";
                      price[z] = 199;
                     z++;
                    System.out.println("The cost for your purchase is Rs 199");
cost = cost + 199;
} else if (num == 2) {
    name[z] = "Shorts/tops";
    price[z] = 225;
    z++;
    System.out.println("The cost for your purchase is Rs 225");
    cost = cost + 225;
} else 
    System.out.println("Please check your input");
    break;
}
case 2:
    System.out.println("Welcome to the 1-6 years category section and we are very glad to help you choose clothes for your little angels!");
    System.out.println("Please enter the gender of the kid. For example, female or male.");
    sex = std.nextLine();
    if (sex.equalsIgnoreCase("female")) {
        System.out.println("We are very glad to announce all that is in store for your young baby girl.");
        System.out.println("Kindly look around and choose the correct size for your darling!!!");
        System.out.println("Please enter \n1. for skirts/t-shirts/shorts \n2. for plain frocks \n3. for frilled frocks \n4. pretty dresses \n5. for dungrees and pants/Jeans 6. for ghagras!");
        int num = std.nextInt();
        if (num == 1) {
            name[z] = "Skirts/t-shirts/shorts";
            price[z] = 299;
            z++;
            System.out.println("The cost for your purchase is Rs 299");
            cost = cost + 299;
        } else if (num == 2) {
            name[z] = "Plain Frocks";
            price[z] = 265;
            z++;
            System.out.println("The cost for your purchase is Rs 265");
            cost = cost + 265;
        }
        else if (num == 3) {
            name[z] = "Frilled Frocks";
            price[z] = 325;
            z++;
            System.out.println("The cost for your purchase is Rs 325");
            cost = cost + 325;
        } else if (num == 4) {
            name[z] = "Pretty Dresses";
            price[z] = 300;
            z++;
            System.out.println("The cost for your purchase is Rs 300");
            cost = cost + 300;
        } else if (num == 5) {
            name[z] = "Dungrees and Pants/Jeans";
            price[z] = 299;
            z++;
            System.out.println("The cost for your purchase is Rs 299");
            cost = cost + 299;
        } else if (num == 6) {
            name[z] = "Ghagras";
            price[z] = 399;
            z++;
            System.out.println("The cost for your purchase is Rs 399");
            cost = cost + 399;
        } 
        else 
        {
            System.out.println("Please check your input");
        }
        } 
        else if (sex.equalsIgnoreCase("male")) {
            System.out.println("We are very glad to announce all that is in store for your young baby boy.");
            System.out.println("Kindly look around and choose the correct size for your darling!!!");
            System.out.println("Please enter \n1. for pants/t-shirts \n2. for shorts/tops \n3. for trousers 4.for small sherwanis");
            int num = std.nextInt();
            if (num == 1) {
                name[z] = "pants/t-shirts";
                price[z] = 299;
                z++;
                System.out.println("The cost for your purchase is Rs 299");
                cost = cost + 299;
            } else if (num == 2) {
                name[z] = "Shorts/tops";
                price[z] = 225;
                z++;
                System.out.println("The cost for your purchase is Rs 225");
                cost = cost + 225;
            } else if (num == 3) {
                name[z] = "Trousers";
                price[z] = 399;
                z++;
                System.out.println("The cost for your purchase is Rs 399");
                cost = cost + 399;
            } 
            else if (num == 4) {
                name[z] = "Small Sherwanis";
                price[z] = 399;
                z++;
                System.out.println("The cost for your purchase is Rs 399");
                cost = cost + 399;
            } 
            else 
                System.out.println("Please check your input");
                break;
        }
            case 3:
                System.out.println("Welcome to the 7-12 years category section and we are very glad to help you choose clothes for your little angels.");
                System.out.println("Please enter the gender of the kid. For example female or male");
                sex = std.nextLine();
                if (sex.equalsIgnoreCase("female")) {
                    System.out.println("We are very glad to announce all that is in store for your young baby girl.");
                    System.out.println("Kindly look around and choose the correct size for your darling!!!");
System.out.println("Please enter \n1. for skirts/t-shirts/shorts \n2. pretty dresses \n3. for dungrees and pants/Jeans \n4. for ghagras!");
int num = std.nextInt();

if (num == 1) {
    name[z] = "Skirts/t-shirts";
    price[z] = 399;
    z++;
    System.out.println("The cost for your purchase is Rs 399");
    cost = cost + 399;
} else if (num == 2) {
    name[z] = "Pretty Dresses";
    price[z] = 295;
    z++;
    System.out.println("The cost for your purchase is Rs 295");
    cost = cost + 295;
} else if (num == 3) {
    name[z] = "Dungrees and Pants/Jeans";
    price[z] = 325;
    z++;
    System.out.println("The cost for your purchase is Rs 325");
    cost = cost + 325;
} else if (num == 4) {
    name[z] = "Ghagras";
    price[z] = 300;
    z++;
    System.out.println("The cost for your purchase is Rs 300");
    cost = cost + 300;
} else {
    System.out.println("Please check your input");
}

} else if (sex.equalsIgnoreCase("male")) {
    System.out.println("We are very glad to announce all that is in store for your young baby boy.");
    System.out.println("Kindly look around and choose the correct size for your darling!!!");
    System.out.println("Please enter \n1. for pants/t-shirts \n2. for shorts/tops \n3. for trousers \n4. for small sherwanis !");
int num = std.nextInt();
if (num == 1) {
    name[z] = "Pants/t-shirts";
    price[z] = 299;
    z++;
    System.out.println("The cost for your purchase is Rs 299");
    cost = cost + 299;
} else if (num == 2) {
    name[z] = "Shorts/tops";
    price[z] = 225;
    z++;
    System.out.println("The cost for your purchase is Rs 225");
    cost = cost + 225;
} else if (num == 3) {
    name[z] = "Trousers";
    price[z] = 399;
    z++;
    System.out.println("The cost for your purchase is Rs 399");
    cost = cost + 399;
} else if (num == 4) {
    name[z] = "Small Sherwanis";
    price[z] = 399;
    z++;
    System.out.println("The cost for your purchase is Rs 399");
    cost = cost + 399;
} else 
    System.out.println("Please check your input");
    break;
}
case 4:
    System.out.println("Welcome to the 8-15 years category section and we are very glad to help you choose clothes for your little angels.");
    System.out.println("Please enter the gender of the kid. For example, female or male.");
   sex = std.nextLine();

if (sex.equalsIgnoreCase("female")) {
    System.out.println("We are very glad to announce all that is in store for your young baby girl.");
    System.out.println("Kindly look around and choose the correct size for your darling!!!");
    System.out.println("Please enter \n1. for skirts/t-shirts/shorts \n2. pretty dresses \n3. for dungrees and pants/Jeans \n4. for ghagras!");
    int num = std.nextInt();

    if (num == 1) {
        name[z] = "Skirts/t-shirts/shorts";
        price[z] = 399;
        z++;
        System.out.println("The cost for your purchase is Rs 399");
        cost = cost + 399;
    } else if (num == 2) {
        name[z] = "Pretty Dresses";
        price[z] = 395;
        z++;
        System.out.println("The cost for your purchase is Rs 395");
        cost = cost + 395;
    } else if (num == 3) {
        name[z] = "Dungrees and Pants/Jeans";
        price[z] = 325;
        z++;
        System.out.println("The cost for your purchase is Rs 325");
        cost = cost + 325;
    } else if (num == 4) {
        name[z] = "Ghagras";
        price[z] = 300;
        z++;
        System.out.println("The cost for your purchase is Rs 300");
        cost = cost + 300;
    } 
    else 
        System.out.println("Please check your input");
} else if (sex.equalsIgnoreCase("male")) {
    System.out.println("We are very glad to announce all that is in store for your young baby boy.");
    System.out.println("Kindly look around and choose the correct size for your darling!!!");
System.out.println("Please enter \n1. for pants/t-shirts \n2. for shorts/tops \n3. for trousers \n4.for small sherwanis !");
int num = std.nextInt();

if (num == 1) {
    name[z] = "Pants/t-shirts";
    price[z] = 399;
    z++;
    System.out.println("The cost for your purchase is Rs 399");
    cost = cost + 399;
} else if (num == 2) {
    name[z] = "Shorts/tops";
    price[z] = 325;
    z++;
    System.out.println("The cost for your purchase is Rs 325");
    cost = cost + 325;
} else if (num == 3) {
    name[z] = "Trousers";
    price[z] = 299;
    z++;
    System.out.println("The cost for your purchase is Rs 299");
    cost = cost + 299;
} else if (num == 4) {
    name[z] = "Small Sherwanis";
    price[z] = 399;
    z++;
    System.out.println("The cost for your purchase is Rs 399");
    cost = cost + 399;
} else 
    System.out.println("Please check your input");
    break;
}
    default:
    System.out.println("Please check your Input");
}
std.close();
} // end of function Kids

public void Accessories() throws NoSuchElementException,IOException {
    Scanner std = new Scanner(System.in);

    System.out.println("Welcome to the Accessories section !!!");
    System.out.println("We provide a wide range of selections of accessories to choose from.");
    System.out.println("If you are looking for the basic necessities then you are in the right place!");
    System.out.println("The accessories available are given below so please enter the number of your choice.");
    System.out.println("Enter \n1. for cosmetics \n2. for belts \n3. for bangles/bracelets \n4. for chains with beautiful pendants \n5. for hairbands/clips etc.. \n6. ties");

    int chwo = std.nextInt();

    switch (chwo) {
        case 1:
            System.out.println("We are glad to announce that there is 15% discount on your purchase of Rs 2000");
            disc = 2000 - (0.15 * 2000);
            cost = cost + disc;
            name[z] = "Cosmetics";
            price[z] = disc;
            z++;
            System.out.println("The cost of your purchase after calculating discount is Rs " + disc);
            break;

        case 2:
            System.out.println("We are glad to announce that there is 5% discount on your purchase of Rs 500");
            disc = 500 - (0.05 * 500);
            cost = cost + disc;
            name[z] = "Belts";
            price[z] = disc;
            z++;

            System.out.println("The cost of your purchase after calculating discount is Rs " + disc);
            break;

        case 3:
            System.out.println("We are glad to announce that there is 5% discount on your purchase of Rs 299");
            disc = 299 - (0.05 * 299);
            cost = cost + disc;
            name[z] = "Bangles/Bracelets";
            price[z] = disc;
            z++;

            System.out.println("The cost of your purchase after calculating discount is Rs " + disc);
            break;

        case 4:
            System.out.println("We are glad to announce that there is 2% discount on your purchase of Rs 250");
            disc = 250 - (0.02 * 250);
cost = cost + disc;
name[z] = "Chains";
price[z] = disc;
z++;
System.out.println("The cost of your purchase after calculating discount is Rs " + disc);
break;

case 5:
    System.out.println("We are glad to announce that there is 2% discount on your purchase of Rs 150");

    disc = 150 - (0.02 * 150);
    cost = cost + disc;
    name[z] = "Hairbands/Clips";
    price[z] = disc;
    z++;
    System.out.println("The cost of your purchase after calculating discount is Rs " + disc);
    break;

case 6:
    System.out.println("We are glad to announce that there is 2% discount on your purchase of Rs 175");

    disc = 175 - (0.02 * 175);
    cost = cost + disc;
    name[z] = "Ties";
    price[z] = disc;
    z++;
    System.out.println("The cost of your purchase after calculating discount is Rs " + disc);
    break;

default:
    System.out.println("Please check your Input");

}
std.close();
}//end of function Accessories
public void Shoes() throws NoSuchElementException,IOException {
    Scanner std = new Scanner(System.in);
    System.out.println("Welcome to the Shoes section !!!");
    System.out.println("We provide a wide range of Shoes for all those shoe lovers out there.");
    System.out.println("All you need to do is look around and find what you like in your size!");
    System.out.println("For more convenience we have grouped Mens Footwear and Womens Footwear!");
    System.out.println("Enter \n1. for Mens Footwear and \n2. for Womens Footwear!");

    int chwo = std.nextInt();

    switch (chwo) {
        case 1:
            System.out.println("Welcome to the Mens Footwear Section!!!");
            System.out.println("We hope to fulfill your need and thus provide you with a range of choices to choose from!");
            System.out.println("Enter \n1. for normal/running shoes/Converse \n2. for boots \n3. for sandals \n4. Leather shoes.");
            int num = std.nextInt();
            if (num == 1) {
                name[z] = "Normal/Running shoes/Converse";
                price[z] = 3000;
                z++;
                System.out.println("The cost for your purchase is Rs 3000");
                cost = cost + 3000;
            } else if (num == 2) {
                name[z] = "Boots";
                price[z] = 6500;
                z++;
                System.out.println("The cost for your purchase is Rs 6500");
                cost = cost + 6500;
            } else if (num == 3) {
                name[z] = "Sandals";
                price[z] = 2000;
                z++;
                System.out.println("The cost for your purchase is Rs 2000");
                cost = cost + 2000;
            } else if (num == 4) {
                name[z] = "Leather shoes";
                price[z] = 4000;
                z++;
                System.out.println("The cost for your purchase is Rs 4000");
                cost = cost + 4000;
            } else
                System.out.println("Please check your input");
                break;
            
            case 2:
                System.out.println("Welcome to the Womens Footwear Section!!!");
                System.out.println("We hope to fulfill your need and thus provide you with a range of choices to choose from!");
                System.out.println("Enter \n1. for normal/running shoes \n2. for boots \n3. for sandals/flats \n4. stilletos \n5. for mid heels and \n6.for high heels.");
                num = std.nextInt();
            
                if (num == 1) {
                    name[z] = "Normal/Running shoes";
                    price[z] = 3000;
                    z++;
                    System.out.println("The cost for your purchase is Rs 3000");
                    cost = cost + 3000;
                }
                else 
                if (num == 2) {
                    name[z] = "Boots";
                    price[z] = 6500;
                    z++;
                    System.out.println("The cost for your purchase is Rs 6500");
                    cost = cost + 6500;
                } else if (num == 3) {
                    name[z] = "Sandals/Flats";
                    price[z] = 2000;
                    z++;
                    System.out.println("The cost for your purchase is Rs 2000");
                    cost = cost + 2000;
                } else if (num == 4) {
                    name[z] = "Stilletos";
                    price[z] = 5400;
                    z++;
                    System.out.println("The cost for your purchase is Rs 5400");
                    cost = cost + 5400;
                } else if (num == 5) {
                    name[z] = "Mid Heels";
                    price[z] = 4000;
                    z++;
                    System.out.println("The cost for your purchase is Rs 4000");
                    cost = cost + 4000;
                } else if (num == 6) {
                    name[z] = "High Heels";
                    price[z] = 4500;
                    z++;
                    System.out.println("The cost for your purchase is Rs 4500");
                    cost = cost + 4500;
                } else 
                    System.out.println("Please check your input");
                    break;
                default:
                    System.out.println("Please check your Input");
                }
                
              // end of function Shoes
                         std.close();                               
            }
        }