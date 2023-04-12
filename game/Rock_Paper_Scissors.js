// 게임에 필요한 정보를 저장할 객체
const gameData = {
    choices: ['가위', '바위', '보'],
    computerChoice: '',
    userChoice: '',
    result: '',
    gameCount: 0,
    winCount: 0,
    drawCount: 0,
    defeatCount: 0
};

// 버튼에 리스너 추가
const $btn = document.getElementById('buttons');
const $resultBtn = document.getElementById('resultBtns');

$btn.addEventListener('click', e => {
    if(e.target.matches('button')) {
        clearTimeout();
        const decisionRn = decisionRandomChoice();
        const decisionNum = decisionUserChoice(e.target);
        console.log('decisionUserChoice 완료');
        saveValue(decisionRn, decisionNum);
        console.log('saveValue 완료');
        judgeResult();
        console.log('judgeResult 완료');
        showResult();
        console.log('showResult 완료');
    }
    // if (e.target.matches('#rock')) {
    //     console.log('바위 클릭됌!');
    // } else if (e.target.matches('#scissors')) {
    //     console.log('가위 클릭됌!');
    // } else if (e.target.matches('#paper')) {
    //     console.log('보 클릭됌!');
    // } 
    else return;
});

$resultBtn.addEventListener('click', e => {
    if (e.target.matches('#restart')) {
        console.log('다시하기 클릭됌!');
    } else if (e.target.matches('#quit')) {
        console.log('그만하기 클릭됌!');
    }
});

// 가위바위보 값을 결정할 난수 생성 함수
function decisionRandomChoice() {
    const decisionRn = Math.floor(Math.random() * 3);
    console.log(decisionRn);
    return decisionRn;
}

// 유저가 선택한 가위바위보 값 전달
function decisionUserChoice(target) {
    let decisionNum = 0;
    if (target.matches('#scissors')) {
        console.log('가위');
        return decisionNum;
    } else if (target.matches('#rock')) {
        console.log('바위');
        return decisionNum = 1;
    } else if (target.matches('#paper')) {
        console.log('보');
        return decisionNum = 2;
    }
}

// 객체에 결정된 값 저장
function saveValue(decisionRn, decisionNum) {
    gameData.computerChoice = gameData.choices[decisionRn];
    gameData.userChoice = gameData.choices[decisionNum];
    console.log(gameData.computerChoice);
    console.log(gameData.userChoice);
};

// 객체에 저장된 값을 바탕으로 승부 판정
function judgeResult() {
    const {computerChoice, userChoice} = gameData;
    if (userChoice === computerChoice) {
        gameData.result = '비겼습니다.';
        gameData.gameCount++;
        gameData.drawCount++;
    } else if (userChoice === '바위' && computerChoice === '가위' || userChoice === '가위' && computerChoice === '보' ||
        userChoice === '보' && computerChoice === '바위') {
        gameData.result = '이겼습니다!';
        gameData.gameCount++;
        gameData.winCount++;
    } else {
        gameData.result = '졌습니다...';
        gameData.gameCount++;
        gameData.defeatCount++;
    }
}

// 결과값 출력
function showResult() {
    const $buttons = document.querySelector('#buttons');
    const $result = document.querySelector('.result');
    
    const $comImg = document.createElement('div');
    const $userImg = document.createElement('div');
    $comImg.style.background = 'url(./images/' + gameData.computerChoice + '.png)';
    $userImg.style.background = 'url(./images/' + gameData.userChoice + '.png)';


    $buttons.classList.toggle('hide');
    $result.classList.toggle('hide');


}

(function() {
    // setTimeout(() => {
        // 5초동안 선택하지 않으면 실행할 이벤트 함수
    // }, 5000);
})();