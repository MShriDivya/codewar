import java.io.*;
import java.util.*;
public class K
{
public static boolean isPt(int no){
boolean isPt = true;
int r = 0;
int num;
while(num > 1){
r = num % 2;
if(r != 0)
{
isPt = false;
break;
}
else
{
no = no / 2;
}
}
return isPt;
}
}
