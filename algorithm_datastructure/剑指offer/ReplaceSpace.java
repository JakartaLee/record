/**
	替换字符串中的空格为“%20”
	这题简单，但是要注意细节，特别是要遍历的是哪一个字符串，别搞错了
*/
public class ReplaceSpace {
    public String replaceSpace(StringBuffer str) {
    	StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                sb.append("%20");
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}