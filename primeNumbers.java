import java.io.*;
import java.util.*;
public class primeNumbers
{
 public static void main(String args[])
 {
  int n;
  int status = 1;
  int num = 3;
  System.out.println("First 1000 prime numbers are:");
  System.out.println(2);
  for ( int i = 2 ; i <=1000 ; ) //Declares first prime and where to stop
  {
   for ( int j = 2 ; j <= Math.sqrt(num) ; j++ ) // Calculates if it is a prime number
   {
    
