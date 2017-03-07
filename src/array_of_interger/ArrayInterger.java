package array_of_interger;

import java.util.Scanner;

public class ArrayInterger {
private 	int a[]=new int [10],n;
public void input()
{
	Scanner kb=new Scanner(System.in);
	System.out.print("Eter n= ");
	n=kb.nextInt();
	for(int i=0;i<n;i++){
		System.out.print("Eter element"+i+":");
		a[i]=kb.nextInt();
	}
}
public void output(){
	for(int i=0;i<n;i++)
	{
		System.out.print(a[i]+ " ");
	}
}// in ra cac so chang
public void qestion1(){
	 for(int i=0;i<n;i++)
		 if(a[i]%2==0)
		 System.out.println(a[i]+ " ");
		 
		 
	 
 }// dem caca so le
 public int qestion2()
 {
	 int dem=0;
	 for(int i=0;i<n;i++)
		 if(a[i]%2!=0) dem++;
	 return dem;
	 
 }
 public int question3()
 {
	 int tong =0;
	 for(int i=0;i<n;i++)
		 tong =tong+a[i];
	 return tong;
		 
 }
 public int question4(){
	 int tong=0;
	 for(int i=0;i<n;i++)
		if(i%2!=0&&a[i]%2==0)
			tong=tong+a[i];
	 return tong;
			
 }
 public boolean ktsnt(int x)
{
	 if(x==2)return true;
	 if(x<2) return false;
	 for(int i=2;i<x;i++){
		 if(x%i==0)return false;
	 }
	 return true; 
 }
 /*public boolean ktshh(int x)
 {
	 int tong=0;
	 for(int i=1;i<n;i++)
		 if(x%i==0){
			 tong=tong+i;
		 }
	 if(tong==x) 
	 
		 }
 }*/
public double question5()
{
	double tong=0;
	double dem=0;
	 for(int i=0;i<n;i++)
		 if(ktsnt(a[i])==true){ dem++;
	 tong=tong+a[i];
	 
		 }
	 return tong/dem;
	 
			 
		 
		 
 }
 // so am
 public int question6()
 {
	int dem =0;
	 for(int i=0;i<n;i++)
		 if(a[i]<0) 
			 dem++;
	 return dem;
			 
 }
 public void ktmang(){
	 int dem =0;
	 for(int i=0;i<n;i++){
		 if(a[i]<0) dem++;
		 if(dem==n) System.out.print("mah am");
	 }
 }
 public void mangTang()
 {
	int s=0;
	for(int i=0;i<n-1;i++){
		for(int j=1;j<n;j++){
			if(a[i]>a[j]) s++;
		}
	}
		if(s>0) System.out.println("deo tang");
		else System.out.println("tang nhu xang");
	
	}
 
 public void ktDoixung()
 {
	 int kt =0;
	 for(int i=0;i<n/2;i++){
		 if(a[i]!=a[n-i-1]) kt=1;
	 }
	 if(kt==1){ System.out.println(" k doi xung");
 }else System.out.print("doi xung");
	 
 }
 public void daoMang()
 {
	 System.out.println("mang dao nguoc la");
	 for(int i=n-1;i>=0;i--)
		 System.out.println(a[i]);
 }
 /*public void nhap()
 {
	 int x;
	* Scanner kb=new Scanner(System.in);
	 System.out.print("Eter n= ");
		x=kb.nextInt();
		for(int i=x;i<n;i++){
			a[i]=a[i+1];
			n--;
			
		}
		n--;
		System.out.println("phan tu trong mang da bi xxoa");
	
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+ " ");
		}
	
		
 }*/
/* public void SapxepTang()
 {
	 int tem=0;
	 for(int i=0;i<n-1;i++){
		 for(int j=i+1;j<n;j++){
			 if(a[i]>a[j]) 
				 tem=a[i];
			 a[i]=a[j];
			 a[j]=tem;
		 }
		 System.out.println(a[i]);
	 }
			 
 }*/
public static void main(String agrs[])
{
	ArrayInterger r=new ArrayInterger();
	r.input();
	r.output();
	////r.qestion1();
	//System.out.println( "so le" +r.qestion2());
	//System.out.println( "sum =" +r.question3());
	//System.out.println( "sum =" +r.question4());
	//System.out.println( "so am =" +r.question6());
	//ystem.out.println( "tbcs nto =" +r.question5());
	//r.ktmang();
	//r.mangTang();
//	//r.ktDoixung();
	//r.daoMang();
	//r.SapxepTang();
	
}
}
