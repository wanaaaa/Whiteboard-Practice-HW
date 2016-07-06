public String doubleChar(String str) {
 String doubleStr = "";
        for(int i = 0; i <  str.length(); i++) {
            doubleStr = doubleStr + Character.toString(str.charAt(i)) + Character.toString(str.charAt(i));
        }
        return doubleStr;
}

public boolean cigarParty(int cigars, boolean isWeekend) {
  if (cigars >= 40 && cigars <= 60 ) {
    return true;
  } else if (isWeekend  && cigars > 40) {
    return true;
  } else {
    return false;
  }
}

public int[] rotateLeft3(int[] nums) {
  int[] numArr = {nums[1], nums[2], nums[0]};
  return numArr;
}
