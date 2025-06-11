import java.util.*;

public class Main8 {
    public static String[] reorderLogFiles(String[] logs) {
        List<String> letterLogs = new ArrayList<>();
        List<String> digitLogs = new ArrayList<>();
        for (String log : logs) {
            int firstSpace = log.indexOf(' ');
            String rest = log.substring(firstSpace + 1);
            if (Character.isDigit(rest.charAt(0))) {
                digitLogs.add(log);
            } else {
                letterLogs.add(log);
            }
        }
        Collections.sort(letterLogs, new Comparator<String>() {
            public int compare(String log1, String log2) {
                int idx1 = log1.indexOf(' ');
                int idx2 = log2.indexOf(' ');

                String id1 = log1.substring(0, idx1);
                String id2 = log2.substring(0, idx2);

                String content1 = log1.substring(idx1 + 1);
                String content2 = log2.substring(idx2 + 1);

                int cmp = content1.compareTo(content2);
                if (cmp != 0) {
                    return cmp;
                }
                return id1.compareTo(id2);
            }
        });
        String[] result = new String[logs.length];
        int i = 0;

        for (String log : letterLogs) {
            result[i++] = log;
        }
        for (String log : digitLogs) {
            result[i++] = log;
        }

        return result;
    }

    public static void main(String[] args) {
        String[] logs1 = {"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"};
        String[] logs2 = {"a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"};

        System.out.println(Arrays.toString(reorderLogFiles(logs1)));
        System.out.println(Arrays.toString(reorderLogFiles(logs2)));
    }
}
