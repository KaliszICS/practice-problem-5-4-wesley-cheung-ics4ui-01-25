class MusicPlayer implements Player {
    public boolean onOff;
    public String[] musicList;
    public String currentSong;
    public int volume;

    public MusicPlayer(String[] musicList) {
        this.musicList = musicList;
        this.volume = 0;
        this.onOff = false;
        this.currentSong = "";
    }

    public void start() {
        if (!this.onOff) {
            this.onOff = true;
            this.currentSong = this.musicList[0];
        }
    }
    
    public void stop() {
        if (this.onOff) {
            this.onOff = false;
            this.currentSong = "";
        }
    }

    public boolean getOnOff() {
        return this.onOff;
    }

    public void volumeUp() {
        this.volume += 1;
    }

    public void volumeDown() {
        this.volume -= 1;
    }

    public int getVolume() {
        return this.volume;
    }
    public void next() {
        if (this.currentSong=="") {
            this.currentSong = this.musicList[0];
        } else {
            for (int i = 0;i<this.musicList.length;i++) {
                if (this.musicList[i] == this.currentSong && i<(this.musicList.length-1)) {
                    this.currentSong = this.musicList[i+1];
                    break;
                }
            }
        }
    }

    public void previous() {
        if (this.currentSong=="") {
            this.currentSong = this.musicList[this.musicList.length-1];
        } else {
            for (int i = 0;i<this.musicList.length;i++) {
                if (this.musicList[i] == this.currentSong && (i>0)) {
                    this.currentSong = this.musicList[i-1];
                    break;
                }
            }
        }
    }

    public String getCurrentSong() {
        return this.currentSong;
    }
}