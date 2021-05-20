// 1. 업비트 로그인 후 https://upbit.com/balances?currency=BTC 이동
// 2. 개발자도구 콘솔창 입력.
// window.open("/","","width=400,height=400,left=600");
// 3. 새 창에 아래 소스 입력
// 4. $(opener.document).ready(pizza_init(real));
// 5. 이후 주소 클릭해 스페이스바 -> 백스페이스바 -> 출금신청 버튼 클릭 -> 카카오페이 인증하기

var test = {
    address : "btc-pizzaday-2021",
    // amount	: 0.001,
    amount : 0.001,
    interval: 300
};
var real = {
    address : "btc-pizzaday-2021",
    // amount	: 0.001,
    amount : 0.0001,
    interval: 300
};

function pizza_input(pizza_var) {
    // 송금주소 입력 -> 안 먹음
    $("[class=AddressSelect__NickNameAddress]",opener.document).val(pizza_var.address);

    // 최대 버튼 클릭
    $(".AmountItem",opener.document)[3].click();

    $("[class=AddressSelect__NickNameAddress]",opener.document)[0].focus();

    // 입금 확인 버튼
    $(".AddressSelect__NickNameAddress", opener.document).on("input", function(e) {
        if (e.currentTarget.value === "btc-pizzaday-2021") {
            $("a[title=출금신청]", opener.document).click();
        }
    });
}

function pizza_init(pizza_var) {

    // 출금신청, 바로출금 체크
    $("a[title=출금신청]",opener.document)[0].click();
    $("span[class=chkB]:eq(1)",opener.document).children("a:eq(1)")[0].click();

    // 출금 동의 체크
    $(".agree a",opener.document)[0].click();

    const min_placeholder = $(".AmountInput > input",opener.document).attr("placeholder");
    if (min_placeholder !== "최소 "+pizza_var.amount+" BTC") {
        window.opener.location.reload();
        return;
    } else {
        $(".TitleBlock",opener.document).attr("style","background-color: greenyellow;");
        $(".TitleBlock__title",opener.document).text("Pizza 가즈아!!!");
        $(".TitleBlock__title",opener.document).attr("style", "font-weight: bold; font-size: 30px; color: red;");
    }

    // 입력값 작성
    setTimeout(() => pizza_input(pizza_var), pizza_var.interval);

}