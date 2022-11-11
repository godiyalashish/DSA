
        String str = br.readLine();
        int []count = new int[128];
        for(int i=0; i<str.length(); i++){
            count[str.charAt(i)]++;
        }
        int countZ = 0;
        for(int i=0; i<128; i++){
            countZ += count[i]%2;
        }
        if(countZ <= 0 ){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }