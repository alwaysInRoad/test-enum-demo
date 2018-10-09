package com.zr.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {

	public static void main(String[] args) {
		test();
	}
	public static void test(){
		String substring = "ParamValidate";
		//���ݷ����ȡ������
		try {
			Class c2 = Class.forName("com.zr.entity.Constant");
			//��ȡ�������е������ڲ���
			Class innerClazz[] = c2.getDeclaredClasses();
			//�����ڲ���
			for (Class class1 : innerClazz) {
				//�ж����ǲ���ö����
				if(class1.isEnum()){
					//��ȡ�ڲ��ڵ���������������ʵ���ǻ�ȡö����
					 String simpleName = class1.getSimpleName();
					//�����ȡö����
					 Class<Enum> clazz = (Class<Enum>)Class.forName("com.zr.entity.Constant$"+simpleName);
					 //��ȡ����ö��ʵ��
					 Enum[] enumConstants = clazz.getEnumConstants();
					 //���ݷ�������ȡ����
					 Method getCode = clazz.getMethod("getDesc");
					 for (Enum enum1 : enumConstants) {
					 	 //�õ�ö��ʵ����
						 String name2 = enum1.name();
						 //ִ��ö�ٷ������ö��ʵ����Ӧ��ֵ
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
