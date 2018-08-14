public class FindCommonElement3Arrays {
	public void findCommon(int [] A, int [] B, int [] C)
{
		int i=0,j=0,k=0;
		while(i<A.length && j<B.length && k<C.length)
{
			if((A[i]==B[j])&& (B[j]==C[k]))
{
				System.out.print(A[i] + " ");
				i++;j++;k++;
			}
else if((A[i]<=B[j])&& (A[i]<=C[k]))
{
				i++;
			}
else if((B[j]<=A[i])&& (B[j]<=C[k]))
{
				j++;
			}
else
{
				k++;
			}
		}
	}
	public static void main(String args[]){
		int [] A = {2,5,6,8,9,10};
		int [] B = {1,3,7,11,12,5};
		int [] C = {7,5,6,2,8,12,5};
		FindCommonElement3Arrays f = new FindCommonElement3Arrays();
		System.out.print("Common Elements are : ");
		f.findCommon(A, B, C);
}
}
