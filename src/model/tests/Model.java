package model.tests;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

public class Model {

	private static ArrayList<String> list = new ArrayList<String>();
	public static void main(String[] args) {
		list.add("raz");
		list.add("dwa");
		list.add("trzy");
		list.add("cztery");
		list.add("piec");
		
		System.out.println("\n--------------------TESTY NA LIŒCIE---------------------");
		System.out.println(list.contains("dwa") + " | " + list.get(2));
		list.set(2, "trzyy");
		System.out.println(list.contains("siedem") + " | " + list.get(2));
		System.out.println("Rozmiar listy custom method: " + getRowCount(list));
		System.out.println("Rozmiar listy \"size\": " + list.size());
		
		
		System.out.println("\n--------------------DATAMODEL---------------------");
		DataModel<String> datamodel = new ListDataModel<String>(list);
		System.out.println("1. " + datamodel.getRowCount()
				+ " \n2. " + datamodel.getRowData()
				+ " \n3. " + datamodel.getRowIndex()
				+ " \n4. " + datamodel.getWrappedData());
		
		System.out.println("\n--------------------DODANIE 2 ELEMENTOW DO LISTY---------------------");
		list.add("szesc");
		list.add("siedem");
		for(String item : list){
			System.out.println(item);
		}
		
		System.out.println("\n--------------------SPRAWDZENIE DATAMODEL---------------------");
		System.out.println("1. " + datamodel.getRowCount()
				+ " \n2. " + datamodel.getRowData()
				+ " \n3. " + datamodel.getRowIndex()
				+ " \n4. " + datamodel.getWrappedData());
	}
	
	/**
	 * 
	 * @param list
	 * @return zwraca liczbe elementow od jedynki
	 * je¿eli isEmpty - zwraca -1
	 */
	public static int getRowCount(List<String> list){
		if(!list.isEmpty()){
			ListIterator<String> iterator = list.listIterator();
			int size=0;
			while(iterator.hasNext()){
				iterator.next();
				size++;
			}
			return size;
		}
	return -1;	
	}
}
