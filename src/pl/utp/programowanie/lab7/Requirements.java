package pl.utp.programowanie.lab7;

public class Requirements {
    private final Integer gpuGb;
    private final Integer HDDGb;
    private final Integer RAMGb;
    private final Double cpuGhz;
    private final Integer coresNum;

    public Requirements(Integer gpuGb, Integer hddGb, Integer ramGb, Double cpuGhz, Integer coresNum) {
        this.gpuGb = gpuGb;
        HDDGb = hddGb;
        RAMGb = ramGb;
        this.cpuGhz = cpuGhz;
        this.coresNum = coresNum;
    }

    @Override
    public String toString() {
        return "Requirements{" +
                "gpuGb=" + gpuGb +
                ", HDDGb=" + HDDGb +
                ", RAMGb=" + RAMGb +
                ", cpuGhz=" + cpuGhz +
                ", coresNum=" + coresNum +
                '}';
    }
}
