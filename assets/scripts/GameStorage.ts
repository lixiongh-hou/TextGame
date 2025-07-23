

export const GameStorage = {
    get(key) {
        return localStorage.getItem(key);
    },
    set(key, value) {
        localStorage.setItem(key, value);
    },
    setBlockType(level, row, col, blockType) {
        localStorage.setItem(`block_${level}_${row}_${col}`, blockType);
    },
    getBlockType(level, row, col) {
        return localStorage.getItem(`block_${level}_${row}_${col}`);
    },
    remove(key) {
        localStorage.removeItem(key);
    },
    clear() {
        localStorage.clear();
    },
    delete(key) {
        localStorage.removeItem(key);
    },
    deleteAll() {
        localStorage.clear();
    },

    setCurLevel(level) {
        localStorage.setItem('curLevel', level);
    },
    getCurLevel() {
        return Number(localStorage.getItem('curLevel'));
    },

    setPassedLevel(level) {
        localStorage.setItem('passedLevel', level);
    },

    getPassedLevel() {
        return Number(localStorage.getItem('passedLevel'));
    },


};

export default GameStorage;