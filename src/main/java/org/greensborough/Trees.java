package org.greensborough;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Trees
{
  public static void main( String[] args )
  {
    final Node<String> root = new Node<String>( "root" );
    for ( int i = 0; i < 10; i++ )
    {
      root.add( new Leaf<Integer>( i ) );
    }
    System.out.println( root );
  }

  public static class Entry<T>
  {
    private final T value;

    public Entry( final T value )
    {
      this.value = value;
    }

    public T get()
    {
      return value;
    }

    @Override
    public String toString()
    {
      return String.format( "Entry{ value = %s }", value );
    }
  }

  public static class Leaf<T>
    extends Entry<T>
  {
    public Leaf( final T value )
    {
      super( value );
    }
  }

  public static class Node<T>
    extends Entry<T>
    implements List<Entry>
  {

    private java.util.List<Entry> children = new ArrayList<Entry>();

    public Node( final T t )
    {
      super( t );
    }

    public Node<T> connect( final Entry entry )
    {
      return this;
    }

    @Override
    public int size()
    {
      return children.size();
    }

    @Override
    public boolean isEmpty()
    {
      return children.isEmpty();
    }

    @Override
    public boolean contains( final Object o )
    {
      return children.contains( o );
    }

    @Override
    public Iterator<Entry> iterator()
    {
      return children.iterator();
    }

    @Override
    public Object[] toArray()
    {
      return children.toArray();
    }

    @Override
    public <Node> Node[] toArray( final Node[] a )
    {
      return children.toArray( a );
    }

    @Override
    public boolean add( final Entry t )
    {
      return children.add( t );
    }

    @Override
    public boolean remove( final Object o )
    {
      return children.remove( o );
    }

    @Override
    public boolean containsAll( final Collection<?> c )
    {
      return children.containsAll( c );
    }

    @Override
    public boolean addAll( final Collection<? extends Entry> c )
    {
      return children.addAll( c );
    }

    @Override
    public boolean addAll( final int index, final Collection<? extends Entry> c )
    {
      return children.addAll( index, c );
    }

    @Override
    public boolean removeAll( final Collection<?> c )
    {
      return children.removeAll( c );
    }

    @Override
    public boolean retainAll( final Collection<?> c )
    {
      return children.retainAll( c );
    }

    @Override
    public void clear()
    {
      children.clear();
    }

    @Override
    public boolean equals( final Object o )
    {
      return children.equals( o );
    }

    @Override
    public int hashCode()
    {
      return children.hashCode();
    }

    @Override
    public Entry get( final int index )
    {
      return children.get( index );
    }

    @Override
    public Entry set( final int index, final Entry element )
    {
      return children.set( index, element );
    }

    @Override
    public void add( final int index, final Entry element )
    {
      children.add( index, element );
    }

    @Override
    public Entry remove( final int index )
    {
      return children.remove( index );
    }

    @Override
    public int indexOf( final Object o )
    {
      return children.indexOf( o );
    }

    @Override
    public int lastIndexOf( final Object o )
    {
      return children.lastIndexOf( o );
    }

    @Override
    public ListIterator<Entry> listIterator()
    {
      return children.listIterator();
    }

    @Override
    public ListIterator<Entry> listIterator( final int index )
    {
      return children.listIterator( index );
    }

    @Override
    public java.util.List<Entry> subList( final int fromIndex, final int toIndex )
    {
      return children.subList( fromIndex, toIndex );
    }

    @Override
    public String toString()
    {
      return String.format( "Entry { %s, children = %s  }", super.toString(), children );
    }
  }
}
