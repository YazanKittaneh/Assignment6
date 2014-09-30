package com.farevee.groceries;

public class BulkFood
{

  // +--------+------------------------------------------------------
  // | Fields |
  // +--------+
  String bulkName;
  Units bulkUnit;
  int bulkPrice;
  int bulkSupply;
  
  
  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+
  public BulkFood(String name, Units unit, int pricePerUnit, int supply)
  {
    bulkName=name;
    bulkUnit=unit;
    bulkPrice=pricePerUnit;
    bulkSupply=supply;
  }
  
  // +---------+----------------------------------------------------
  // | Methods |
  // +---------+
  
  
 
}
