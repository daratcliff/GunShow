package workout;
import java.sql.Date;
import java.util.Scanner;
import java.util.*;

public class GunShow {

public static void main(String[] args) {
	String [] Stretches = {"Shoulder", "Tricep", "Lower Back", "Hamstring", "Quad", "Calf", "Hip flex"};
int number;	
Object name = null;
Gunshowfinal Glock19 = new Gunshowfinal();

System.out.print("Enter weight in pounds: "); // user enters weight
Scanner scanner  = new Scanner(System.in);
double weight = scanner.nextDouble();

System.out.print("Enter height in inches: "); // user enters height
double height = scanner.nextDouble();

final double KILOGRAMS_PER_POUND = 0.45359237; // constant
final double METERS_PER_INCH = 0.0254; // constant

// compute BMI
double weightInKilograms = weight * KILOGRAMS_PER_POUND;
double heightInMeters = height * METERS_PER_INCH;
double bmi = weightInKilograms / (heightInMeters * heightInMeters);

// Results
System.out.println("BMI is " + bmi);
if (bmi <= 18.5) 
            System.out.println("Underweight");
        
else if (bmi <= 25) 
            System.out.println("Normal");
       
else if (bmi <= 30) 
            System.out.println("Overweight");
        
else 
            System.out.println("Obese");



Scanner input = new Scanner(System.in);

System.out.println("Enter a number 1-12:");
     int month = input.nextInt();

getMonths(month);
 
System.out.println(" Welcome to the GUN SHOW "); //Welcome
System.out.println();
System.out.print("Enter a Trainee Number :");//Enter Trainee Number

number =input.nextInt();//

workOut(number, name);
System.out.println();

System.out.print("Given the list of stretches, which one would you be interest in trying? (input number)");
listStretch(Stretches);
int option = input.nextInt();

System.out.print("Thank you, have a good day");

char z= input.next().charAt(0);// If statement to continue or not 


   

}    
public static void listStretch(String [] Stretches) { // list the stretches in the array
	for (int i = 0; i < Stretches.length; i++) {
		System.out.print(i + "." + Stretches[i] + "/n" );
		
	}
	
}


public static void workOut(int number, Object name) {
  Scanner input = new Scanner(System.in);
  System.out.print("Does this person work out this month? (y/n) : ");
  String answer = input.next();
  
  if(answer.startsWith("y") && number == 100){
  System.out.println(" Charlie ");
System.out.println("Warmup Stretch, Bike for 5 minutes"
+ "Squats 3x10, Box Jumps 3x10, Hamstring curls 2x10 Quad kicks 2x10");
System.out.println();
  } else if (answer.startsWith("y") && number == 200) {
System.out.println(" Ben ");
System.out.println("Warmup Stretch Mile Walk"
+ "Leg Day/Upper Body day Box Jumps 2x10, Jump rope 2x2 mins, squat jumps 3x15 body wieght"
+ "Push ups 3x25, dumbbell curls 3x10  ");
System.out.println();
  } else if (answer.startsWith("y") && number == 300) {
  System.out.println(" Sara Thompson ");
System.out.println("  Warm up Stretch ,Body weight squats 4x15, Lunges 3x10,Jump rope 2x45 sec's  ");
System.out.println();
  } else if (answer.startsWith("y") && number == 400) {
  System.out.println(" Brittany ");
System.out.println(" Warmup Light jog, Full body workout, Body weight squats 4x20 Dumbbell curls 3x10 light weight  ");
System.out.println();
  } else if (answer.startsWith("y") && number == 500) {
  System.out.println(" Sarah ");
System.out.println(" Warm up Jumping Jacks, Lunges4x10, Dumbell push press 2x10 Dumbbell curls 2x10 light weight  ");
System.out.println();
  } else if (answer.startsWith("y") && number == 600) {
  System.out.println(" Harry ");
System.out.println(" Warm up jog half a mile "
+ "Body weight squats 4x20 Barbell curls 3x10 light weight, abs 3x50 crutches  ");
System.out.println();
  } else if (answer.startsWith("y") && number == 700) {
  System.out.println(" Bernie ");
System.out.println(" Warmup Sretch, Jumping Jacks, Plyomertics off the box,"
+ "One leg squat of the bench 2x10 body weight, Dumbell Lunges 2x10  ");
System.out.println();
  } else if (answer.startsWith("y") && number == 800) {
  System.out.println(" kayla ");
System.out.println("Warm up Stretch , Walk half a mile, Tone day, Squats 2x20, Hip Thrust 2x15, "
+ "Squat outs 2x20  ");
System.out.println();
  } else if (answer.startsWith("y") && number == 900) {
  System.out.println(" Of Month for Trainees Enjoy ");
System.out.println("Prepare your minds for the next month ");
System.out.println();
  } else if (answer.startsWith("y") && number == 1000) {
  System.out.println(" Ant ");
System.out.println(" Warm up Stretch,  Walk half a mile, Heavy weight, Bench Press 4x10 go up 5 pounds every set "
+ "Dumbell Curls 3x10, Dumbell flys 2x10, Dumbbell, Bench Press 3x10 1,2,3=1 ");
System.out.println();
  } else if (answer.startsWith("y") && number == 1100) {
  System.out.println(" James ");
System.out.println(" Warmup Stretch Jump rope for warmup, Plyometrics 3x10 off the box, Squats 3x10"
+ "Jump rope with wieght vest on for time 3x 1 min each set  ");
System.out.println();
  } else if (answer.startsWith("y") && number == 1200) {
  System.out.println(" Tom ");
System.out.println("  Warm up Stretch , Body weight squats 4x20 Dumbbell curls 3x10 light weight  ");
System.out.println();
  }
  while (answer.startsWith("n") || answer.startsWith("N")) {
	  System.out.print("Since this person has not had a sesssion with us, \nplease provide us with a name so we may get them enrolled: ");
	  
	  String trainee = input.next();
	  System.out.print("Thank you, would " + trainee + " like to start their sesssion right now? " );
	  String output = input.next();
	  if (output.startsWith("y") || output.startsWith("Y")) {
		  workOut(number, name);
	  } else {
		  System.out.print("Thank you have a good evening");
	  }
	  break;
  }
}
 public static void getMonths(int month) {
 Scanner input = new Scanner(System.in);
switch (month) {
case 1:System.out.println("January- Charlie");break; //These are the names of the trainees that we will be creating BMI and workouts for 
case 2:System.out.println("Feburary- Ben");break;
case 3:System.out.println("March- Sara");break;
case 4:System.out.println("April- Brittany");break;
case 5:System.out.println("May- Sarah");break;
case 6:System.out.println("June- Harry");break;
case 7:System.out.println("July-Bernie");break;
case 8:System.out.println("August- Kayla");break;
case 9:System.out.println("September- This will be able recovery month for all Trainees. Drink plenty of fluids and rest");break;
case 10:System.out.println("October- Ant");break;
case 11:System.out.println("November- James");break;
case 12:System.out.println("December- Tom");break;
default:System.out.println("Error:Inavlid");
while (month > 3) {
System.out.print("Enter a new number, 1-12");
int newMonth = input.nextInt();
}
System exit; 

}

 }



private void getTrainee(int x) {
// TODO Auto-generated method stub

        

}
}

