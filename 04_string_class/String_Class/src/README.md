# String Class

<b>1. 문자열 비교(compareTo())</b>

<b>2. Null과 빈문자열</b>
    
    값이 Null인 데이터의 길이를 확인하면 NullPointerException이 발생한다. 
    빈문자열은 데이터 길이를 확인하면 에러없이 값이 0으로 출력된다.
<b>3. 스트링 클래스 생성자</b>
    
    1) new String();
    2) new String(byte[] bytes);
    3) new String(byte[] bytes, Charset charset);
    4) new String(byte[] bytes, int offset, int length);
    5) new String(byte[] bytes, int offset, int length, Charset charset);
    6) new String(byte[] bytes, int offset, int length, String charsetName);
    7) new String(byte[] bytes, String charsetName);
    8) new String(char[] value);
    9) new String(char[] value, int offset, int count);
