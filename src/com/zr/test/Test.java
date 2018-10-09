package com.zr.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {

	public static void main(String[] args) {
		test();
	}
	public static void test(){
		String substring = "ParamValidate";
		//根据反射获取常量类
		try {
			Class c2 = Class.forName("com.zr.entity.Constant");
			//获取常量类中的所有内部类
			Class innerClazz[] = c2.getDeclaredClasses();
			//遍历内部内
			for (Class class1 : innerClazz) {
				//判断类是不是枚举类
				if(class1.isEnum()){
					//获取内部内的类名，在这里其实就是获取枚举类
					 String simpleName = class1.getSimpleName();
					//反射获取枚举类
					 Class<Enum> clazz = (Class<Enum>)Class.forName("com.zr.entity.Constant$"+simpleName);
					 //获取所有枚举实例
					 Enum[] enumConstants = clazz.getEnumConstants();
					 //根据方法名获取方法
					 Method getCode = clazz.getMethod("getDesc");
					 for (Enum enum1 : enumConstants) {
					 	 //得到枚举实例名
						 String name2 = enum1.name();
						 //执行枚举方法获得枚举实例对应的值
						 Object invoke = getCode.invoke(enum1);
						 System.out.println(name2+":"+invoke.toString());
					 }
				 }
				
				
				 
				 
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
}
