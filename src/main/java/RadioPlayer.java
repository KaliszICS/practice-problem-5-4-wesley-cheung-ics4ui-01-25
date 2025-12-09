class RadioPlayer implements Player {
    public boolean onOff;
    public double[] stationList;
    public double station;
    public int volume;

    public RadioPlayer(double[] stationList) {
        this.stationList = stationList;
        this.volume = 0;
        this.onOff = false;
        this.station = 0;
    }

    public void start() {
        if (!this.onOff) {
            this.onOff = true;
            this.station = this.stationList[0];
        }
    }
    
    public void stop() {
        if (this.onOff) {
            this.onOff = false;
            this.station = 0;
        }
    }

    public boolean getOnOff() {
        return this.onOff;
    }

    public void volumeUp() {
        this.volume += 2;
    }

    public void volumeDown() {
        this.volume -= 2;
    }

    public int getVolume() {
        return this.volume;
    }

    public void next() {
        if (this.station==0) {
            this.station = this.stationList[0];
        } else {
            for (int i = 0;i<this.stationList.length;i++) {
                if (this.stationList[i] == this.station && i<(this.stationList.length-1)) {
                    this.station = this.stationList[i+1];
                    break;
                }
            }
        }
    }

        public void previous() {
        if (this.station==0) {
            this.station = this.stationList[this.stationList.length-1];
        } else {
            for (int i = 0;i<this.stationList.length;i++) {
                if (this.stationList[i] == this.station && (i>0)) {
                    this.station = this.stationList[i-1];
                    break;
                }
            }
        }
    }


    public double getStation() {
        return this.station;
    }
}