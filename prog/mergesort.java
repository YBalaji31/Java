public void merge(int[] nums1, int m, int[] nums2, int n) {
       int[] res=new int[m];
        for(int i=0;i<m;i++){
            res[i]=nums1[i];
        }

       int i=0,j=0; 
       int k=0;
       while(i<m && j<n){
        if(res[i]<nums2[j]){
            nums1[k]=res[i];
            k++;
            i++;
        }
        else{
            nums1[k]=nums2[j];
            k++;
            j++;
        }
       }
       while(i<m){
        nums1[k]=res[i];
            k++;
            i++;
       }
       while(j<nums2.length){
        nums1[k]=nums2[j];
            k++;
            j++;
       }

    }