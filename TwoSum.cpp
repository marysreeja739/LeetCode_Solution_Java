/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* nums, int numsSize, int target, int* returnSize) {
    int *arr=(int*) malloc(2*sizeof(int));
    int sum=0;
    for(int i=0;i<numsSize;i++)
    {
        for(int j=i+1;j<numsSize;j++)
        {
            sum=nums[i]+nums[j];
            if(sum==target)
            {
                arr[0]=i;
                arr[1]=j;
                *returnSize=2;
                return arr;
            }
        }
    }
    *returnSize =0;
    return NULL;
}
