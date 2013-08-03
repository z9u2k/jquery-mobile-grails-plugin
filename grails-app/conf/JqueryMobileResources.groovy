modules = {

    'jquery-mobile' {
        dependsOn 'jquery'
        resource url:[plugin: 'jquery-mobile', dir: '/css', file: 'jquery.mobile-1.3.2.css'], disposition: 'head'
        resource url:[plugin: 'jquery-mobile', dir: '/js', file: 'jquery.mobile-1.3.2.js'], disposition: 'head'
	[ 'ajax-loader.gif', 'icons-18-black.png', 'icons-18-white.png', 'icons-36-black.png', 'icons-36-white.png' ].each { file ->
        	resource url:[plugin: 'jquery-mobile', dir: '/css/images', file: "$file" ], disposition: 'head'
	}
    }
}
