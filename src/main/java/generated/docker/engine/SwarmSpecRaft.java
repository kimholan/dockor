package generated.docker.engine;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Raft configuration.
 **/

public class SwarmSpecRaft   {
  
  private Integer snapshotInterval;
  private Integer keepOldSnapshots;
  private Integer logEntriesForSlowFollowers;
  private Integer electionTick;
  private Integer heartbeatTick;

  /**
   * The number of log entries between snapshots.
   **/
  public SwarmSpecRaft snapshotInterval(Integer snapshotInterval) {
    this.snapshotInterval = snapshotInterval;
    return this;
  }

  

  
  @JsonProperty("SnapshotInterval")
  public Integer getSnapshotInterval() {
    return snapshotInterval;
  }

  public void setSnapshotInterval(Integer snapshotInterval) {
    this.snapshotInterval = snapshotInterval;
  }/**
   * The number of snapshots to keep beyond the current snapshot. 
   **/
  public SwarmSpecRaft keepOldSnapshots(Integer keepOldSnapshots) {
    this.keepOldSnapshots = keepOldSnapshots;
    return this;
  }

  

  
  @JsonProperty("KeepOldSnapshots")
  public Integer getKeepOldSnapshots() {
    return keepOldSnapshots;
  }

  public void setKeepOldSnapshots(Integer keepOldSnapshots) {
    this.keepOldSnapshots = keepOldSnapshots;
  }/**
   * The number of log entries to keep around to sync up slow followers after a snapshot is created. 
   **/
  public SwarmSpecRaft logEntriesForSlowFollowers(Integer logEntriesForSlowFollowers) {
    this.logEntriesForSlowFollowers = logEntriesForSlowFollowers;
    return this;
  }

  

  
  @JsonProperty("LogEntriesForSlowFollowers")
  public Integer getLogEntriesForSlowFollowers() {
    return logEntriesForSlowFollowers;
  }

  public void setLogEntriesForSlowFollowers(Integer logEntriesForSlowFollowers) {
    this.logEntriesForSlowFollowers = logEntriesForSlowFollowers;
  }/**
   * The number of ticks that a follower will wait for a message from the leader before becoming a candidate and starting an election. &#x60;ElectionTick&#x60; must be greater than &#x60;HeartbeatTick&#x60;.  A tick currently defaults to one second, so these translate directly to seconds currently, but this is NOT guaranteed. 
   **/
  public SwarmSpecRaft electionTick(Integer electionTick) {
    this.electionTick = electionTick;
    return this;
  }

  

  
  @JsonProperty("ElectionTick")
  public Integer getElectionTick() {
    return electionTick;
  }

  public void setElectionTick(Integer electionTick) {
    this.electionTick = electionTick;
  }/**
   * The number of ticks between heartbeats. Every HeartbeatTick ticks, the leader will send a heartbeat to the followers.  A tick currently defaults to one second, so these translate directly to seconds currently, but this is NOT guaranteed. 
   **/
  public SwarmSpecRaft heartbeatTick(Integer heartbeatTick) {
    this.heartbeatTick = heartbeatTick;
    return this;
  }

  

  
  @JsonProperty("HeartbeatTick")
  public Integer getHeartbeatTick() {
    return heartbeatTick;
  }

  public void setHeartbeatTick(Integer heartbeatTick) {
    this.heartbeatTick = heartbeatTick;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var swarmSpecRaft = (SwarmSpecRaft) o;
    return Objects.equals(this.snapshotInterval, swarmSpecRaft.snapshotInterval) &&
        Objects.equals(this.keepOldSnapshots, swarmSpecRaft.keepOldSnapshots) &&
        Objects.equals(this.logEntriesForSlowFollowers, swarmSpecRaft.logEntriesForSlowFollowers) &&
        Objects.equals(this.electionTick, swarmSpecRaft.electionTick) &&
        Objects.equals(this.heartbeatTick, swarmSpecRaft.heartbeatTick);
  }

  @Override
  public int hashCode() {
    return Objects.hash(snapshotInterval, keepOldSnapshots, logEntriesForSlowFollowers, electionTick, heartbeatTick);
  }

  @Override
  public String toString() {

    return "class SwarmSpecRaft {\n" +
                          "    snapshotInterval: " + toIndentedString(snapshotInterval) + "\n" +
                          "    keepOldSnapshots: " + toIndentedString(keepOldSnapshots) + "\n" +
                          "    logEntriesForSlowFollowers: " + toIndentedString(logEntriesForSlowFollowers) + "\n" +
                          "    electionTick: " + toIndentedString(electionTick) + "\n" +
                          "    heartbeatTick: " + toIndentedString(heartbeatTick) + "\n" +
                          "}";
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

