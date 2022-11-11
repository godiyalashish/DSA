public static boolean areAnagram(String str1, String str2){
    if(str1.length() != str2.length()) return false;
    char arr1[] = str1.toCharArray();
    char arr2[] = str2.toCharArray();
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    return new String(arr1).equals(new String(arr2));
}