package rooms

class SpoofController {

    final CHROME  = 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36'
    final FIREFOX = 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10.15; rv:120.0) Gecko/20100101 Firefox/120.0'
    final SAFARI  = 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/17.1.2 Safari/605.1.15'
    final IPAD    = 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/17.1.2 Safari/605.1.15'
    final IPHONE  = 'Mozilla/5.0 (iPhone; CPU iPhone OS 17_1_2 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/17.1.2 Mobile/15E148 Safari/604.1'


    def headers() {
        String result = '<pre>';

        result += '\n' + 'Headers:'
        request.getHeaderNames()
            .each { headerName -> result += '\n' +  "${headerName}: ${request.getHeader(headerName)}" }

        result += '</pre>'
        render text: result.toString()
    }

    def index() {
        render view:"index"
    }

    def show(String height, String width) {
        render text: "height is $height and width is $width"
    }
}
