

// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.userLookup.userDomainClassName =    'rooms.SecUser'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'rooms.SecUserSecRole'
grails.plugin.springsecurity.authority.className =               'rooms.SecRole'

grails.plugin.springsecurity.logout.postOnly = false // allow logout via get url /logout

grails.plugin.springsecurity.controllerAnnotations.staticRules = [
	[pattern: '/',               access: ['permitAll']],
	[pattern: '/error',          access: ['permitAll']],
	[pattern: '/index',          access: ['permitAll']],
	[pattern: '/index.gsp',      access: ['permitAll']],
	[pattern: '/shutdown',       access: ['permitAll']],
	[pattern: '/assets/**',      access: ['permitAll']],
	[pattern: '/**/js/**',       access: ['permitAll']],
	[pattern: '/**/css/**',      access: ['permitAll']],
	[pattern: '/**/images/**',   access: ['permitAll']],
	[pattern: '/**/favicon.ico', access: ['permitAll']]
]

grails.plugin.springsecurity.filterChain.chainMap = [
	[pattern: '/assets/**',      filters: 'none'],
	[pattern: '/**/js/**',       filters: 'none'],
	[pattern: '/**/css/**',      filters: 'none'],
	[pattern: '/**/images/**',   filters: 'none'],
	[pattern: '/**/favicon.ico', filters: 'none'],
	[pattern: '/**',             filters: 'JOINED_FILTERS']
]


// config types are 'Annotation', 'Requestmap', or 'InterceptUrlMap'
 grails.plugin.springsecurity.securityConfigType = 'InterceptUrlMap'
 grails.plugin.springsecurity.interceptUrlMap =  [
 	[pattern: '/static/**',      access: ['permitAll']], // static resources are unsecured (HomeSecondSpec running)
 	[pattern: '/',               access: ['permitAll']],
	[pattern: '/error',          access: ['permitAll']],
	[pattern: '/index',          access: ['permitAll']],
	[pattern: '/index.gsp',      access: ['permitAll']],
	[pattern: '/shutdown',       access: ['permitAll']],
	[pattern: '/assets/**',      access: ['permitAll']],
	[pattern: '/**/js/**',       access: ['permitAll']],
	[pattern: '/**/css/**',      access: ['permitAll']],
	[pattern: '/**/images/**',   access: ['permitAll']],
	[pattern: '/**/favicon.ico', access: ['permitAll']],

 	[pattern: "/login/auth",     		access: ["permitAll"]],
 	[pattern: "/spoof/**",       		access: ["permitAll"]],
	[pattern: '/calculator/**',  		access: ['permitAll']],
	[pattern: '/inPlaceCalculator/**', 	access: ['permitAll']],
	[pattern: '/today/**',       		access: ['permitAll']],

 	[pattern: "/person/**" ,     access: ['ROLE_ADMIN']], // cannot use constant here :-(
 	[pattern: "/room/**"   ,     access: ['ROLE_ADMIN']],

 	[pattern: "/**"        ,     access: ['ROLE_ADMIN', 'ROLE_GUEST']], // if not in the whitelist above, this is the fallback

 ]

