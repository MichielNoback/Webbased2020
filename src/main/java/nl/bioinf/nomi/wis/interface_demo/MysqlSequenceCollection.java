package nl.bioinf.nomi.wis.interface_demo;

import java.util.List;

public class MysqlSequenceCollection implements SequenceCollection {
    //connection

    private void connect() {

    }

    @Override
    public FastaSequence getSequenceById(String id) {
        throw new UnsupportedOperationException("not implemented yet");
    }

    @Override
    public List<FastaSequence> getAllSequences() {
        throw new UnsupportedOperationException("not implemented yet");
    }

}
