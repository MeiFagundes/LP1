// LinkedList v3 By Mei

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LinkedList {
    private Nodo primNodo;
    private Nodo ultNodo;
    private Object object;
    private String name;
    private int size;


    public LinkedList(){
        this( "LinkedList" );
    }

    public LinkedList(String listName){
        this.name = listName;
        primNodo = ultNodo = null;
        size = 0;
    }

    public Object get(int index){
        Nodo current;

        if (index + 1 > size || index < 0) {
            System.out.println("Index out of bounds");
            return null;
        }

        if (size - index > size/2) {
            current = primNodo;
            for (int i = 0; i < index; i++) {
                current = current.nextNodo;
            }
            return current.data.GetData();
        } else{
            current = ultNodo;
            for (int i = size - 1; i > index; i--) {
                current = current.prevNodo;
            }
            return current.data.GetData();
        }

    }

    public int length(){
        return size;
    }

    public void insertHead(Data data ){
        if ( isEmpty() )
            primNodo = ultNodo = new Nodo(data );
        else
            primNodo = new Nodo(data, primNodo);
        size++;
    }

    public void insertTail(Data data) {
        if ( isEmpty() )
            primNodo = ultNodo = new Nodo(data);
        else
            ultNodo = ultNodo.nextNodo = new Nodo(ultNodo, data);
        size++;
    }

    public void insertArraySequentially(Object[] object) {
        for (int i = 0; i < object.length; i++) {
            if (!searchFromObject(object[i]))
                insertTail(new Data(object[i]));
        }
    }

    public void InsertArraySequentiallyWithoutDuplicates(Object[] object) {
        for (int i = 0; i < object.length; i++) {
            if (!searchFromObject(object[i]))
                insertTail(new Data(object[i]));
        }
    }

    public Object removeHead() throws ExcecaoListaVazia {
        if ( isEmpty() ){
            throw new ExcecaoListaVazia(name);
        }
        Data removedData = primNodo.data;
        if ( primNodo == ultNodo ) {
            primNodo = ultNodo = null;
        } else {
            primNodo = primNodo.nextNodo;
            primNodo.prevNodo = null;
        }
        size--;
        return removedData;
    }

    public Object removeTail() throws ExcecaoListaVazia
    {
        if ( isEmpty() ){
            throw new ExcecaoListaVazia(name);
        }

        Data removedData = ultNodo.data;

        if ( primNodo == ultNodo ) {
            primNodo = ultNodo = null;
        }
        else
        {
            Nodo current = primNodo;
            while ( current.nextNodo != ultNodo )
                current = current.nextNodo;
            ultNodo = current;
            current.nextNodo = null;
        }
        size--;
        return  removedData;
    }

    public void remove(int index) throws ExcecaoListaVazia
    {
        if (isEmpty() ){
            throw new ExcecaoListaVazia(name);
        }
        Nodo current;
        
        current = primNodo;
        if (index == 0) {
            removeHead();
            return;
        }
        else if (index == length() - 1) {
            removeTail();
            return;
        }
        else{

            if (size - index > size/2) {
                current = primNodo;
                for (int i = 0; i < index - 1; i++) {
                    current = current.nextNodo;
                }
            } else{
                current = ultNodo;
                for (int i = size; i > index; i--) {
                    current = current.prevNodo;
                }
            }
    }

        current.nextNodo.nextNodo.prevNodo = current.nextNodo.prevNodo;
        current.nextNodo = current.nextNodo.nextNodo;
        size--;
    }

    public boolean isEmpty()
    {
        return primNodo == null;
    }

    public void print() throws ExcecaoListaVazia
    {
        if (isEmpty() ){
            throw new ExcecaoListaVazia(name);
        }

        System.out.println("\nThe "+ this.name +" consists of: ");
        Nodo current = primNodo;


        while ( current != null )
        {
            System.out.printf( "%s ", current.data.GetData() );
            current = current.nextNodo;
        }

        System.out.printf( "\n" );
    }

    public void printReverse() throws ExcecaoListaVazia
    {
        if (isEmpty() ){
            throw new ExcecaoListaVazia(name);
        }

        System.out.println("\nThe "+ object +" consists of (in reverse): ");
        Nodo current = ultNodo;


        while ( current != null )
        {
            System.out.printf( "%s ", current.data.GetData() );
            current = current.prevNodo;
        }

        System.out.println( "\n" );
    }

    public void connect(LinkedList l) throws ExcecaoListaVazia
    {
        if (isEmpty() ){
            throw new ExcecaoListaVazia(name);
        }

        ultNodo.nextNodo = l.primNodo;
        ultNodo.nextNodo.prevNodo = ultNodo;

        Nodo current = primNodo;
        while ( current.nextNodo != null )
            current = current.nextNodo;
        ultNodo = current;

        size += l.length();
    }

    public Data getData(int index){
        Nodo current = primNodo;
        for (int i = 0; i < index; i++) {
            current = current.nextNodo;
        }
        return current.data;
    }

    public boolean compareTo(Object comp) {
        if (isEmpty() ){
            return false;
        }

        Nodo current = primNodo;
        while ( current != null )
        {
            if (current.data.GetData() == comp) {
                return true;
            }
            current = current.nextNodo;
        }
        return false;
    }

    public Object[] toArray(){

        Object[] object = new Object[length()];
        Nodo current = primNodo;

        for (int i = 0; current != null; i++) {
            object[i] = current.data.GetData();
            current = current.nextNodo;
        }
        return object;
        
    }

    public void sort(){
        //ArrayList list = Arrays.asList(toArray());
        Object[] object =  toArray();
        Arrays.sort(object);
        //Collections.sort(list);

        primNodo = ultNodo = null;
        size = 0;

        insertArraySequentially(object);
    }

    public boolean searchFromObject(Object target) {
        if (isEmpty() ){
            return false;
        }

        Nodo current = primNodo;
        while ( current != null )
        {
            if (current.data.GetData().equals(target)) {
                return true;
            }
            current = current.nextNodo;
        }
        return false;
    }

    public int getIndexOf(Object target) throws ExcecaoListaVazia {
        if (isEmpty() ){
            throw new ExcecaoListaVazia(name);
        }

        Nodo current = primNodo;

        for (int i = 0; i < size - 1; i++) {
            if (current.data.GetData().equals(target)) {
                return i;
            }
            current = current.nextNodo;
        }
        return -1;

    }
}
