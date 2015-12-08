package fr.iutvalence.info.dut.m3105.preamble.version2;

public abstract class TrafficSignalState
{
	
	protected final int durationInSeconds;
	
	protected TrafficSignalState(int durationInSeconds)
	{
		this.durationInSeconds = durationInSeconds;
	}
	
	protected int getDurationInSeconds()
	{
		return this.durationInSeconds;
	}
	
	public abstract void callButton(TrafficSignal TS);
	
	public abstract void tick(TrafficSignal TS);
	
}
