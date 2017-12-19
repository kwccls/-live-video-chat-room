/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opalvoip;

public final class OpalMediaStates {
  public final static OpalMediaStates OpalMediaStateNoChange = new OpalMediaStates("OpalMediaStateNoChange");
  public final static OpalMediaStates OpalMediaStateOpen = new OpalMediaStates("OpalMediaStateOpen");
  public final static OpalMediaStates OpalMediaStateClose = new OpalMediaStates("OpalMediaStateClose");
  public final static OpalMediaStates OpalMediaStatePause = new OpalMediaStates("OpalMediaStatePause");
  public final static OpalMediaStates OpalMediaStateResume = new OpalMediaStates("OpalMediaStateResume");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static OpalMediaStates swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + OpalMediaStates.class + " with value " + swigValue);
  }

  private OpalMediaStates(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private OpalMediaStates(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private OpalMediaStates(String swigName, OpalMediaStates swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static OpalMediaStates[] swigValues = { OpalMediaStateNoChange, OpalMediaStateOpen, OpalMediaStateClose, OpalMediaStatePause, OpalMediaStateResume };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

