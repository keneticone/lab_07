package pl.utp.programowanie.lab7;

public class ComputerGame implements PCGame{
    private final String name;
    private final PegiAgeRating pegiAgeRating;
    private final Double budgetInMillionsOfDollars;
    private final Integer minimumGpuMemoryInMegabytes;
    private final Integer diskSpaceNeededInGB;
    private final Integer ramNeededInGb;
    private final Integer coresNeeded;
    private final Double coreSpeedInGhz;

    public ComputerGame(String name, PegiAgeRating pegiAgeRating, Double budgetInMillionsOfDollars,
                        Integer minimumGpuMemoryInMegabytes, Integer diskSpaceNeededInGB, Integer ramNeededInGb, Integer coresNeeded, Double coreSpeedInGhz) {
        this.name = name;
        this.pegiAgeRating = pegiAgeRating;
        this.budgetInMillionsOfDollars = budgetInMillionsOfDollars;
        this.minimumGpuMemoryInMegabytes = minimumGpuMemoryInMegabytes;
        this.diskSpaceNeededInGB = diskSpaceNeededInGB;
        this.ramNeededInGb = ramNeededInGb;
        this.coresNeeded = coresNeeded;
        this.coreSpeedInGhz = coreSpeedInGhz;
    }

    @Override
    public String getTitle() {
        return name;
    }

    @Override
    public Integer getPegiAllowedAge() {
        return Integer.valueOf(pegiAgeRating.name().substring(1));
    }

    @Override
    public boolean isTripleAGame() {
        return budgetInMillionsOfDollars > 50;
    }

    @Override
    public Requirements getRequirements() {
        return new Requirements(minimumGpuMemoryInMegabytes / 1024, diskSpaceNeededInGB, ramNeededInGb, coreSpeedInGhz, coresNeeded);
    }


    public enum PegiAgeRating {
    P3, P7, P12, P16, P18


} }