//1.	打印九九乘法表： 
public class UseFor2 { 
 public static void main(String[] args){   int i=1; 
  for(;i<=9;i++){    int j=1; 
   for(;j<=i;j++){ 
System.out.print(i+"*"+j+"="+i*j+"\t");    
 } 
  System.out.println();   
}  
} 
} 

//2.高斯算法示例 
public class ForABC{   
 public static void main(String args[]){    
      int i  
         int a[] = { 11,22,33,44,55,66,77,88,99 };          
for ( i = 0  i <= a.length / 2  i ++ )
{            
              System.out.print(a[i]+a[a.length-i-1]+ " ");               
System.out.println( );         
 }     
} 
} 

//3.多态高级题目： 
public class TestNNNNNNN { 
/*1.传参的时候需要注意一个原则： 就近原则:找形参的类型和自身类型最接近的那个方法  2.多态的时候，如a2能调用A类里的show(D)和show(A) ,但是 show(A)被B类重写了，所以实际调用B类里的show(A) */ 
public static void main(String[] args)
 {   
A a1 = new A();  
 A a2 = new B();   
B b  = new B();   
C c  = new C();   
D d  = new D();   // 
 System.out.println(a1.show(b));   
System.out.println(a1.show(c)); 
 System.out.println(a1.show(d));   // 
 System.out.println(a2.show(b));   
System.out.println(a2.show(c));   
System.out.println(a2.show(d));   // 
 System.out.println(b.show(b));   
System.out.println(b.show(c));   
System.out.println(b.show(d)); 
 } 
} 
class A { 
 public String show (D obj)
{  
return("A and D"); 
 } 
 public String show (A obj)
{  
 return("A and A");  
} 
} 
class B extends A { 
 public String show (B obj)
{   
return("B and B");  
} 
 public String show (A obj)
{  
 return("B and A"); 
 } 
} 
class C extends B { } 
class D extends B { }  

//4.51是不是素数的代码 
public class TestPr { 
 public static void main(String [] args){   //局部变量一定先声明  在赋值    
 int i = 51; 
  for(int j=2;j<51;j++){ 
   //如果余数为0，则被整出   
   if(i%i==0){ 
System.out.println(i+"不是素数");     //跳出循环 中止循环     
break;    
}
} 
 } 
} 

//5.闰年控制输出算法 
public class HeapYear{ 
 public static void main (String[]args )
{   
int i=0; 
 for ( i = 2000;i<=2200;i++) 
      if((i%4==0&&i%100!=0)||(i%400==0)){    System.out.print(i+" "); 
 } 
} 
} 

//6.阶乘算法代码    For循环： 
 public static void main(String[] args)
{   
Scanner scan=new Scanner(System.in);   
System.out.println("请输入整数");   
int n=scan.nextInt();   
int j=1;         
int sum=1; 
 for(int i=1;i<=n;i++)
{    
j=j*i;            
 sum=sum+j;    } 
  System.out.println(sum);   
}
 } 
Do while循环： 
public static void main(String[] args)
 {  
 int j=1;    
int i=1;        
 int sum=1;      
do{ 
      j=j*i;       
i++; 
 sum=sum+j;      } 
  while(i<=10); 
 System.out.println(sum);  
} 

//7.do……while语句简单示例 
public class UseFor { 
 public static void main(String[] args){ 
int i=1; 
  System.out.print("输出10个整数");  
 do { 
   System.out.print(i+"\t");  
  i++;  
} 
  while(i<=10); 
  System.out.println(""); 
  System.out.println("已经成功的输出十个整数了"); 
 } 
} 

//8.重载理解的示范代码 
public class MehordOverLoading 
{ 
 public static int multiply(int a,int b)
{   
return a*b;   
} 
 public static double multiply(double a,int b)
{   
return a*b; 
 } 
 public static double multiply(int a,double b)
{   
return a*b;  
} 
 public static double add(double a ,double b)
{   
return a+b;  
} 
 public static double divd(int a,double b)
{      
return a/b;      
} 
 public static void main(String[] args) 
{   
System.out.println(multiply(5.5, 6));  
 System.out.println(multiply(7, 8.8));  
}
 } 
 
//9.while语句以及if语句的运用 
public class testBinary { 
 public static void main(String[] args) {  
 Scanner scan = new Scanner(System.in);   
 double a;
 double b;    
  while(true){ 
   System.out.println("请输入第一个数：");    
   if(scan.hasNextInt()){     
   a=scan.nextInt(); 
    System.out.println("请输入第二个数：");
    if(scan.hasNextInt()){     
    b=scan.nextInt();      
    double sum = 0;      
    sum=a+b;  
     System.out.println("两数之和为："+sum);     
     break;     
     }    
     } 
   System.out.println("出错啦！");   
   break;   
   }  
   } 
   } 
   
//10.冒泡排序 
public class MaoPao {  
public void maoPao(){ 
  int []a={75, 79, 93, 81, 60};   
  int i,j,t; 
  System.out.print("排序前的数组为：");   
  for(i=0;i<5;i++){ 
   System.out.print(a[i]+" ");   
   } 
  System.out.println();   
  for(j=0;j<a.length;j++){ 
   for(i=j+1;i<a.length;i++){ 
    if(a[j]>a[i]){   //如果数组的前一个人元素大于后一个元素      
    t=a[i];      //将前一个元素赋值给中间变量t.      
    a[i]=a[j]; //将后一个元素赋值给前一个人元素      
    a[j]=t;    //将中间变量t的值赋值给后一个元素    
    }    
    }   
    } 
  System.out.print("排序后的数组为：");   
  for(i=0;i<5;i++){ 
   System.out.print(a[i]+" "); //输出数组a的值   
   }  
   } 
public static void main(String[] args){  
MaoPao dd=new MaoPao();  
dd.maoPao(); 
}
} 
//11．进制之间的转换代码（十进制到十六进制） 
public class TestBinary { 
 public static void main(String[] args) {   
 bit2Test(10);   
 bit16Test(20);   //sun公司提供的类 
  System.out.println(Integer.toHexString(20)); 
  } 
 public static void bit2Test(int i){ 
  String str = "";// ""与null有什么区别   
  int a =i;   
  int b = 0;   
  while(i>0){    
  b =i%2;    
  i = i/2; 
   str = b +str;   
   } 
  System.out.println("十进制数"+a+"与二进制数"+str+"等同");  
  }   
 public  static void bit16Test(int i){   
 String str = "";   
 int a = i    
 int b =0;   
 while(i>0){    
 b= i%16;    
 i=i/16;    
 switch (b){    
 case 10: 
    str="A"+str;     break;    case 11: 
    str="B"+str;     break;    case 12: 
    str="C"+str;     break;    case 13: 
    str="D"+str;     break;    case 14: 
    str="E"+str;     break;    case 15:  
    str="F"+str;     break;
default: 
    str = b +str;        
    }   
    } 
  str = "ox"+str; 
  System.out.println("十进制数"+a+"与十六进制数"+str+"等同");  
  }  
  } 
  
//12.打印金字塔 
 public static void main(String[] args){      
 int lay=5; 
 for(int i =1;i<=lay;i++){ 
  for(int k=1;k<=lay-i;k++){ //找出空格规律    
  System.out.print(" ");   
  } 
  for(int j=1;j<=2*i-1;j++){    
  System.out.print("*");   
  } 
  System.out.println( ); //打出一个换行  
  } 
  }  
  
//13.求水仙花数（在如何表示位数上很是经典！） 
public class Flwor { 
 public static void main(String[] args) {     
 System.out.print("水仙花数为：");  
 for(int i=100;i<=999;i++) 
     if((Math.pow(i/100, 3)+Math.pow((i%100)/10, 3)+Math.pow(i%10, 3))==i)       
     System.out.print(i+" ");  
     } 
     }  
     
//14.万年历 
public class PrintCal { 
 public static void print(int year,int month){   //按照计算机的日期规定 月份从零开始  
  //所以设置的月份到计算机时需要进行减一操作   
  month-=1; 
  //实例化一个日历对象 
  Calendar calendar = new GregorianCalendar(); 
  //设置日期对象的时间  也就是将日期定为到我们需要找的那一年那一月   
  calendar.set(Calendar.YEAR, year); 
  calendar.set(Calendar.MONTH, month); 
  calendar.set(Calendar.DAY_OF_MONTH, 1);//万年历每月从1号开始  
  //定义好格式 
  System.out.println("日\t"+"一\t"+"二\t"+"三\t"+"四\t"+"五\t"+"六\t");   //因为每月的第一天可能不是星期日 所以会存在输入日期之前空格的问题   
  //发现前面的空格与星期成正比关系 
  for(int i=1;i<calendar.get(Calendar.DAY_OF_WEEK);i++){    
  System.out.print("\t");   } 
  int j = 0; 
  //每月最多三十一天   
  while(j<100){ 
   System.out.print(calendar.get(Calendar.DAY_OF_MONTH)+"\t");    //每到星期六的时候换一个行 
   if(calendar.get(Calendar.DAY_OF_WEEK)==7){     
   System.out.println();    
   } 
   //每循环一次 令日期加一 
   calendar.add(Calendar.DAY_OF_MONTH, 1); 
   //判断是否循环到了下一个月 也就是当前月日期输入完毕    
   if(calendar.get(Calendar.MONTH)==month+1){     
   return;    
   }    
   j++;   
   }  
   } 
 public static void main(String[] args) {   
 print(2012,3);  
 } 
 }  
 
//15.黑色星期五的寻找： 
public class PrintBlackFriday { 
    public static void main(String[] args) { 
     System.out.println("=====未来十次的黑色星期五列表如下：=======");      //创建一个日历的对象   
  Calendar calendar = new GregorianCalendar();   //每个月只需要判断十三号是否是星期五   
  calendar.set(Calendar.DAY_OF_MONTH, 13);   //定义日期格式化类的进行日期格式化 
  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E");   //用来统计黑色星期五的个数的   
  int sum = 0;   
  while (sum<10){
//判断如果该天为星期五 则符合条件 
   if(calendar.get(Calendar.DAY_OF_WEEK)==6){ 
    System.out.println(sdf.format(calendar.getTime()));   
    sum++;    
    } 
   //每循环一次即进入下一个月份！   
   calendar.add(Calendar.MONTH, 1);   
   } 
  System.out.println("===温馨提示：如遇这十个日期请不要买彩票！==="); 
 }  
}
