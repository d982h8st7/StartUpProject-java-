public class ObjectArrayExam {
    public static void main(String[] args) {
        Movie[] m = new Movie[4];
        for (int i = 0;i < 4; i++ ){
            m[i] = new Movie();
        }
        m[0].mtitle = "A영화";
        m[0].mmajor = "김성민";
        m[0].mtime = 160;
        m[0].mlevel = 15;
        m[0].mday = "2023-01-15";

        m[1].mtitle = "B영화";
        m[1].mmajor = "Java";
        m[1].mtime = 150;
        m[1].mlevel = 11;
        m[1].mday = "2023-05-15";

        m[2].mtitle = "C영화";
        m[2].mmajor = "Python";
        m[2].mtime = 180;
        m[2].mlevel = 9;
        m[2].mday = "2023-05-22";

        m[3].mtitle = "D영화";
        m[3].mmajor = "CPP";
        m[3].mtime = 120;
        m[3].mlevel = 18;
        m[3].mday = "2023-05-10";
        // 반복문
        for (int i = 0 ; i<m.length;i++){
            System.out.println(m[i].mtime+"\t"+m[i].mmajor+"\t"+m[i].mtime+"\t"+m[i].mlevel+"\t"+m[i].mday);
        }
    }

    public static class Movie {
        public String mtitle;
        public String mmajor;
        public int mtime;
        public int mlevel;
        public String mday;
    }
}
