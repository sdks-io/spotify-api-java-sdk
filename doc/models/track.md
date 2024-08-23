
# Track

## Structure

`Track`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `NumSamples` | `Integer` | Optional | The exact number of audio samples analyzed from this track. See also `analysis_sample_rate`. | Integer getNumSamples() | setNumSamples(Integer numSamples) |
| `Duration` | `Double` | Optional | Length of the track in seconds. | Double getDuration() | setDuration(Double duration) |
| `SampleMd5` | `String` | Optional | This field will always contain the empty string. | String getSampleMd5() | setSampleMd5(String sampleMd5) |
| `OffsetSeconds` | `Integer` | Optional | An offset to the start of the region of the track that was analyzed. (As the entire track is analyzed, this should always be 0.) | Integer getOffsetSeconds() | setOffsetSeconds(Integer offsetSeconds) |
| `WindowSeconds` | `Integer` | Optional | The length of the region of the track was analyzed, if a subset of the track was analyzed. (As the entire track is analyzed, this should always be 0.) | Integer getWindowSeconds() | setWindowSeconds(Integer windowSeconds) |
| `AnalysisSampleRate` | `Integer` | Optional | The sample rate used to decode and analyze this track. May differ from the actual sample rate of this track available on Spotify. | Integer getAnalysisSampleRate() | setAnalysisSampleRate(Integer analysisSampleRate) |
| `AnalysisChannels` | `Integer` | Optional | The number of channels used for analysis. If 1, all channels are summed together to mono before analysis. | Integer getAnalysisChannels() | setAnalysisChannels(Integer analysisChannels) |
| `EndOfFadeIn` | `Double` | Optional | The time, in seconds, at which the track's fade-in period ends. If the track has no fade-in, this will be 0.0. | Double getEndOfFadeIn() | setEndOfFadeIn(Double endOfFadeIn) |
| `StartOfFadeOut` | `Double` | Optional | The time, in seconds, at which the track's fade-out period starts. If the track has no fade-out, this should match the track's length. | Double getStartOfFadeOut() | setStartOfFadeOut(Double startOfFadeOut) |
| `Loudness` | `Double` | Optional | The overall loudness of a track in decibels (dB). Loudness values are averaged across the entire track and are useful for comparing relative loudness of tracks. Loudness is the quality of a sound that is the primary psychological correlate of physical strength (amplitude). Values typically range between -60 and 0 db. | Double getLoudness() | setLoudness(Double loudness) |
| `Tempo` | `Double` | Optional | The overall estimated tempo of a track in beats per minute (BPM). In musical terminology, tempo is the speed or pace of a given piece and derives directly from the average beat duration. | Double getTempo() | setTempo(Double tempo) |
| `TempoConfidence` | `Double` | Optional | The confidence, from 0.0 to 1.0, of the reliability of the `tempo`.<br>**Constraints**: `>= 0`, `<= 1` | Double getTempoConfidence() | setTempoConfidence(Double tempoConfidence) |
| `TimeSignature` | `Integer` | Optional | An estimated time signature. The time signature (meter) is a notational convention to specify how many beats are in each bar (or measure). The time signature ranges from 3 to 7 indicating time signatures of "3/4", to "7/4".<br>**Constraints**: `>= 3`, `<= 7` | Integer getTimeSignature() | setTimeSignature(Integer timeSignature) |
| `TimeSignatureConfidence` | `Double` | Optional | The confidence, from 0.0 to 1.0, of the reliability of the `time_signature`.<br>**Constraints**: `>= 0`, `<= 1` | Double getTimeSignatureConfidence() | setTimeSignatureConfidence(Double timeSignatureConfidence) |
| `Key` | `Integer` | Optional | The key the track is in. Integers map to pitches using standard [Pitch Class notation](https://en.wikipedia.org/wiki/Pitch_class). E.g. 0 = C, 1 = C♯/D♭, 2 = D, and so on. If no key was detected, the value is -1.<br>**Constraints**: `>= -1`, `<= 11` | Integer getKey() | setKey(Integer key) |
| `KeyConfidence` | `Double` | Optional | The confidence, from 0.0 to 1.0, of the reliability of the `key`.<br>**Constraints**: `>= 0`, `<= 1` | Double getKeyConfidence() | setKeyConfidence(Double keyConfidence) |
| `Mode` | `Integer` | Optional | Mode indicates the modality (major or minor) of a track, the type of scale from which its melodic content is derived. Major is represented by 1 and minor is 0. | Integer getMode() | setMode(Integer mode) |
| `ModeConfidence` | `Double` | Optional | The confidence, from 0.0 to 1.0, of the reliability of the `mode`.<br>**Constraints**: `>= 0`, `<= 1` | Double getModeConfidence() | setModeConfidence(Double modeConfidence) |
| `Codestring` | `String` | Optional | An [Echo Nest Musical Fingerprint (ENMFP)](https://academiccommons.columbia.edu/doi/10.7916/D8Q248M4) codestring for this track. | String getCodestring() | setCodestring(String codestring) |
| `CodeVersion` | `Double` | Optional | A version number for the Echo Nest Musical Fingerprint format used in the codestring field. | Double getCodeVersion() | setCodeVersion(Double codeVersion) |
| `Echoprintstring` | `String` | Optional | An [EchoPrint](https://github.com/spotify/echoprint-codegen) codestring for this track. | String getEchoprintstring() | setEchoprintstring(String echoprintstring) |
| `EchoprintVersion` | `Double` | Optional | A version number for the EchoPrint format used in the echoprintstring field. | Double getEchoprintVersion() | setEchoprintVersion(Double echoprintVersion) |
| `Synchstring` | `String` | Optional | A [Synchstring](https://github.com/echonest/synchdata) for this track. | String getSynchstring() | setSynchstring(String synchstring) |
| `SynchVersion` | `Double` | Optional | A version number for the Synchstring used in the synchstring field. | Double getSynchVersion() | setSynchVersion(Double synchVersion) |
| `Rhythmstring` | `String` | Optional | A Rhythmstring for this track. The format of this string is similar to the Synchstring. | String getRhythmstring() | setRhythmstring(String rhythmstring) |
| `RhythmVersion` | `Double` | Optional | A version number for the Rhythmstring used in the rhythmstring field. | Double getRhythmVersion() | setRhythmVersion(Double rhythmVersion) |

## Example (as JSON)

```json
{
  "num_samples": 4585515,
  "duration": 207.95985,
  "offset_seconds": 0,
  "window_seconds": 0,
  "analysis_sample_rate": 22050,
  "analysis_channels": 1,
  "end_of_fade_in": 0,
  "start_of_fade_out": 201.13705,
  "loudness": -5.883,
  "tempo": 118.211,
  "tempo_confidence": 0.73,
  "time_signature": 4,
  "time_signature_confidence": 0.994,
  "key": 9,
  "key_confidence": 0.408,
  "mode": 0,
  "mode_confidence": 0.485,
  "code_version": 3.15,
  "echoprint_version": 4.15,
  "synch_version": 1,
  "rhythm_version": 1,
  "sample_md5": "sample_md54"
}
```

