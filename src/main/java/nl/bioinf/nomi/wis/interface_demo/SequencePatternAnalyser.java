package nl.bioinf.nomi.wis.interface_demo;

import java.util.Iterator;

public class SequencePatternAnalyser {
    //private final FastaSequenceCollection sequenceCollection;
    //private MysqlSequenceCollection sequenceCollectionMysql;
    private SequenceCollection sequenceCollection;

    public SequencePatternAnalyser(SequenceCollection sequenceCollection) {
        this.sequenceCollection = sequenceCollection;
    }

    public void analyse() {
//        Iterator seqIter = this.sequenceCollection.iterator();
//        while (seqIter.hasNext()) {
//            System.out.println("seqIter.next() = " + seqIter.next());
//        }

        for (FastaSequence seq : this.sequenceCollection.getAllSequences()) {
            //do something
        }
    }
}
