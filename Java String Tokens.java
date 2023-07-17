import java.io.*;
import java.util.*;
import java.util.Arrays;
public class Solution {


public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
String s = scan.nextLine();
s = s.trim();
// Write your code here.
scan.close();
int count = 0 ;
if (s.isEmpty()){
System.out.println("0");
}
else {
String[] result = s.split("[\\s+!,?._'@]+") ;
for (int i = 0; i < result.length; i++) {
count++;
}
System.out.print(count);
System.out.println();
for (String element : result) {
System.out.println(element);
}
}


}
}
