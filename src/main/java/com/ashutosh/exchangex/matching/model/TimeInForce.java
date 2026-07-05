package com.ashutosh.exchangex.matching.model;

public enum TimeInForce {
    GTC, //(Good-Til-Cancelled) — rests in the book
    IOC, //(Immediate-Or-Cancel) — match what you can right now, cancel the rest
    FOK //(Fill-Or-Kill) — match the entire quantity right now or cancel the whole thing

}
