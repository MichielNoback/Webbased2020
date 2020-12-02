package nl.bioinf.nomi.wis.interface_demo;

import java.util.*;

public class FastaSequenceCollection  implements SequenceCollection{
    /*The SortedMap interface (with the implementation TreeMap):
     *   The interface has the methods:
     *       keySet() which returns a set of the keys in ascending order
     *       values() which returns a collection of all values in the ascending order of the corresponding keys
     */
    Map<String, FastaSequence> sequences = new TreeMap<>();

    public void readFromFile() {

    }

    @Override
    public FastaSequence getSequenceById(String id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<FastaSequence> getAllSequences() {
        List<FastaSequence> tmp = new ArrayList<>();
        Iterator<FastaSequence> seqsIter = iterator();
        while (seqsIter.hasNext()) {
            tmp.add(seqsIter.next());
        }
        return tmp;
    }


    public Iterator<FastaSequence> iterator() {
        return this.sequences.values().iterator();
    }


}
