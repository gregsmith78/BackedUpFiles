

public class Menu{
	
	Console.WriteLine("Welcome to the Fluorine Bank.");
	Console.WriteLine("Please enter 1 to perform a deposit.");
	Console.WriteLine("Enter 2 for a withdrawal.");
	Console.WriteLine("Enter 3 for a account balance.");


}

User Input

Content
Comments
The Crash Course

Get input from the user with Console.ReadLine();
Convert it to what you need using various Convert.To(_); commands.
This tutorial also contains a complete sample that determines the surface area and volume of a cylinder, with dimensions from the user.
Introduction

In this short and simple tutorial, we'll take a look at two additional pieces of code that we'll need to create a simple program that has some actual value.

We'll first learn how to get input from the user through the console window, then how to convert it to the right data types

Then we'll put these pieces and everything we've done so far together into a simple program that determines the surface area and volume of a cylinder.

User Input from the Console

We can get input from the user by using a statement like the following:

string whatTheUserTyped = Console.ReadLine();
This is using another method (we'll discuss methods a lot more later) that reads in an entire line of text from the user (up until the press the <ENTER> key). What the user typed gets put in the variable on the left side, which in this case is called whatTheUserTyped. Remember that you could use any variable there. There's nothing special about this one.

Converting

For many things, though, simply grabbing the user's input and sticking it in a string variable doesn't get it into the right data type for what we need. For instance, what if we need the user to type in a number? When we put it into a string, we can't do addition or anything with it. We'll need to convert it to the right type of data before we can do anything with it. (Though sometimes, a string is the correct data type. For example, a person's name.)

So to convert to the right data type, we're going to use another method that converts any data type to another. (Well, we'll discuss the details of how this works later. That's the simplest way to put it, for now.)

To convert this to, say, an integer, we'd do this:

int aNumber = Convert.ToInt32(whatTheUserTyped);
There's similar methods for each of the possible data types. For instance, ToInt16 is for the type short, ToBoolean is for the type bool, ToDouble is for the type double, and so on. One tricky one is that for the type float, you use ToSingle (as opposed to double—the float type is a "single" precision floating point value).

We'll see this pop up again in a second in the example program.

A Complete Sample Program

Cool. Now we've got a few more important pieces in place, and we can make a cool program that does something real. The program we're going to make is one that allows the user to type in two values, one for the radius of a cylinder, and one for the height. We'll do some math (don't worry about the formulas, I'll provide them to you) to figure out the volume of that cylinder, as well as the surface area. The program will then output the results to the user.

Now, the best way to do this would be for me to have you just do it on your own (don't you just love homework?). Struggling to put the pieces together on your own is the absolute best way to learn what parts you know and what parts you don't. Then, of course, you'd turn in your assignment and we'd spend a few minutes looking it over together. But this is a tutorial, and it's not really going to be able to work out that way. After all, when you get done going through this tutorial, I'm probably going to be off watching an episode of Falling Skies, and I won't be around to discuss it with you.

So in an ideal world, you'd just go ahead and see if you can put the pieces together to do that program. In fact, that's what I'd still recommend—go do the program now, then come back and compare it to what I've got. (Remember, though, that there is always more than one good way to write any given program. Just because yours and mine are different doesn't mean yours (or mine!) is necessarily wrong.)

Anyway, here's the code I have for this program.

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
 
namespace CylinderCalculator
{
    class Program
    {
        static void Main(string[] args)
        {
            // Print a greeting message.  After all, why not?
            Console.WriteLine("Welcome to Cylinder Calculator 1.0!");
 
            // Read in the cylinder's radius from the user
            Console.Write("Enter the cylinder's radius:  ");
            string radiusAsAString = Console.ReadLine();
            double radius = Convert.ToDouble(radiusAsAString);
 
            // Read in the cylinder's height from the user
            Console.Write("Enter the cylinder's height:  ");
            string heightAsAString = Console.ReadLine();
            double height = Convert.ToDouble(heightAsAString);
 
            double pi = 3.1415926536; // We'll learn a better way to do PI in the next tutorial
 
            // These are two standard formulas for volume and surface area of a cylinder.
            // You can find them on Wikipedia: http://en.wikipedia.org/wiki/Cylinder_(geometry)
            double volume = pi * radius * radius * height;
            double surfaceArea = 2 * pi * radius * (radius + height);
 
            // Now we output the results
            Console.WriteLine("The cylinder's volume is:  " + volume + " cubic units.");
            Console.WriteLine("The cylinder's surface area is:  " + surfaceArea + " square units.");
 
            // Wait for the user to respond before closing...
            Console.ReadKey();
        }
    }
}
So let's look at this a little at a time. The first part, with the using statements is all template code that we discussed before.

The first thing we add is a simple "welcome" message to the user.

// Print a greeting message.  After all, why not?
Console.WriteLine("Welcome to Cylinder Calculator 1.0!");
Again, this is basically identical to the hello world example we did earlier. No surprises here.

Next we prompt the user to enter the cylinder's radius and height, and turn them into the right data type using the things we learned in this tutorial:

// Read in the cylinder's radius from the user
Console.Write("Enter the cylinder's radius:  ");
string radiusAsAString = Console.ReadLine();
double radius = Convert.ToDouble(radiusAsAString);
 
// Read in the cylinder's height from the user
Console.Write("Enter the cylinder's height:  ");
string heightAsAString = Console.ReadLine();
double height = Convert.ToDouble(heightAsAString);
The first line is like the Hello World example again, just simple output. We then read in the user's text and store it in a string object. The third line uses more stuff we learned in this tutorial and turns it into the correct data type (for this, we're going to use the double type). We repeat the process with the cylinder's height.

We then define the value of PI (as the comment indicates, more on this next tutorial) and use the math operations we learned last tutorial to calculate the volume and surface area of the cylinder.

double pi = 3.1415926536; // We'll learn a better way to do PI in the next tutorial
 
// These are two standard formulas for volume and surface area of a cylinder.
// You can find them on Wikipedia: http://en.wikipedia.org/wiki/Cylinder_(geometry)
double volume = pi * radius * radius * height;
double surfaceArea = 2 * pi * radius * (radius + height);
Finally, we output the results to the user, again using stuff from our first Hello World program:

// Now we output the results
Console.WriteLine("The cylinder's volume is:  " + volume + " cubic units.");
Console.WriteLine("The cylinder's surface area is:  " + surfaceArea + " square units.");
And finally, we end the program by waiting for the user to press any key:

// Wait for the user to respond before closing...
Console.ReadKey();
And there we have it! Our first useful C# program!

What's Next?

Now that we've learned a few last remaining pieces we need in order to create a real useful program, we're ready to kick it into high gear and make some cooler programs.

Our next stop is going to be to revisit C# math, this time going into a bit more detail. (Yes, I know. There's a lot of math in programming.) After that tutorial, we'll be ready to start to do logic, and make our computer be able to make choices about what it is doing!

