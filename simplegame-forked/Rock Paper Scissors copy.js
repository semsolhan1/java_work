// 컴퓨터가 선택한 가위바위보
const computerChoice = Math.floor(Math.random() * 3);
const choices = ['바위', '가위', '보'];
const computer = choices[computerChoice];

// 사용자가 선택한 가위바위보
let userChoice = '';
document.getElementById('rock').addEventListener('click', function () {
    userChoice = '바위';
    playGame();
});
document.getElementById('scissors').addEventListener('click', function () {
    userChoice = '가위';
    playGame();
});
document.getElementById('paper').addEventListener('click', function () {
    userChoice = '보';
    playGame();
});

// 게임 실행
function playGame() {
    let result = '';
    if (userChoice === computer) {
        result = '비겼습니다.';
    } else if (userChoice === '바위' && computer === '가위' || userChoice === '가위' && computer === '보' ||
        userChoice === '보' && computer === '바위') {
        result = '이겼습니다!';
    } else {
        result = '졌습니다...';
    }
    document.getElementById('result').innerHTML = '컴퓨터: ' + computer + '<br>사용자: ' + userChoice + '<br>' +
        result;
    document.getElementById("computer-choice").innerHTML =
        '<div class="choice-img" style="background-image: url(images/' + computer + '.png)"></div>';
    document.getElementById("user-choice").innerHTML =
        '<div class="choice-img" style="background-image: url(images/' + userChoice + '.png)"></div>';
}