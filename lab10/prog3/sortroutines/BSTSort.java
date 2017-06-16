package lab10.prog3.sortroutines;
import lab10.prog3.runtime.*;

public class BSTSort extends Sorter {

  @Override
  public int[] sort(int[] arr) {
    // TODO Auto-generated method stub
    MyBST myBST = new MyBST();
    myBST.insertAll(arr);
    return myBST.readIntoArray();
  }

}
