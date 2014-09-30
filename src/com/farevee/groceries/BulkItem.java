package com.farevee.groceries;

public class BulkItem
  implements Item
{
  // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+
  
    String name;
    String Unit;
    int pricePerUnit;
    int supply;
    
  // +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+
    
  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+ 
  @Override
  public int getWeight()
  {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public int getPrice()
  {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public String toString(int i)
    throws Exception
  {
    // TODO Auto-generated method stub
    return null;
  }

}
