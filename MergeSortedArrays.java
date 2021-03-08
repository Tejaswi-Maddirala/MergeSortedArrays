import java.util.Arrays;
class MergeSortedArrays{

  public static int[] MergeTwoSortedArrays(int [] Array1,int [] Array2)
  {
    int [] ResultArray = new int[Array1.length+Array2.length];
    if(Array1.length==0)
    {
      return Array2;
    }
    if(Array2.length==0)
    {
      return Array1;
    }
    else
    {
    for(int i=0;i<Array1.length;i++)
    {
     ResultArray[i]=Array1[i];
    }
      int j=Array1.length,i=0;
      while(j<ResultArray.length)
      {
        ResultArray[j]=Array2[i];
        j++;
        i++;
      }
      Arrays.sort(ResultArray);
    }

      return ResultArray;
  }
  public static void main(String[] args) {
    int [] Array1={1,2};
    int [] Array2={0,0};
  int Result[] =  MergeTwoSortedArrays(Array1,Array2);
  for(int i=0;i<Result.length;i++)
  {
    System.out.println(Result[i]);
  }
  }
}