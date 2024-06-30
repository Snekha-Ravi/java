package recursion;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FindAllSubsequencesRec {
    public static void main(String[] args) {
        String str="abc";
        FindAllSubsequencesRecSolution fasr=new FindAllSubsequencesRecSolution();
        Set<String> result=new HashSet<String>();
        result=fasr.findSubSeq(str);
        System.out.println(result);
    }
}

class FindAllSubsequencesRecSolution {
    public static Set<String> findSubSeq(String s) {
        int n=s.length();
        Set<String> resultSet=new HashSet<String>();
        resultSet=findSubSeqUtil(s);
        resultSet.remove("");
        return resultSet;
    }

    private static Set<String> findSubSeqUtil(String s) {
        Set<String> resultSet=new HashSet<String>();
        if(s.length()==1) {
            resultSet.add("");
            resultSet.add(s);
            return resultSet;
        }
        Set<String> partialResultSet=new HashSet<String>();
        partialResultSet=findSubSeqUtil(s.substring(1));
        resultSet=appendFirstCharToPartialResults(s.charAt(0),partialResultSet);
        return resultSet;
    }

    private static Set<String> appendFirstCharToPartialResults(Character ch, Set<String> partialResultSet) {
        Iterator<String> iterator=partialResultSet.iterator();
        String candidateString;
        String newString;
        Set<String> newResultSet=new HashSet<String>();
        while(iterator.hasNext()) {
            candidateString=iterator.next();
            newString=ch+candidateString;
            newResultSet.add(newString);
        }
        newResultSet.addAll(partialResultSet);
        newResultSet.add("");
        return newResultSet;
    }
}
