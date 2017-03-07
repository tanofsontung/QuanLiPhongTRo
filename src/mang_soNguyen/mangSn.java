package mang_soNguyen;

import java.util.Scanner;

public class mangSn {
	private int a[]=new int [10],n;
public void Input()
{
	Scanner kb=new Scanner(System.in);
	System.out.print("nhap n=");
	for(int i=0;i<n;i++){
		System.out.println("stt "+i+":");
	a[i]=kb.nextInt();
	}
}
public void outPut()
{

	for(int i=0;i<n;i++){
		System.out.println(a[i]+" ");
		
	}
}
public void xoaAm()
{
	
	
}
	public static void main(String[] args) {
	mangSn r=new mangSn();
	r.Input();
	r.outPut();
	}

}