package nl.bioinf.nomi.wis.interface_demo;

import java.util.List;

public interface SequenceCollection {

    /**
     * Returns a FastaSequence object based on its ID.
     * THINK ABOUT ERROR CASES! (connection down, no file, no seq)
     * @param id
     * @return
     */
    FastaSequence getSequenceById(String id);

    /**
     * Returns all sequences of the collection, sorted alphabetically.
     * @return
     */
    List<FastaSequence> getAllSequences();
}
