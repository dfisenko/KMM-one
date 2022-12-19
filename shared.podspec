Pod::Spec.new do |spec|
    spec.name                     = 'shared'
    spec.version                  = '1.0'
    spec.homepage                 = 'https://www.cocoapods.org'
    spec.source                   = { :git=> 'git@github.com:dfisenko/KMM-one.git'}
    spec.authors                  = ''
    spec.license                  = ''
    spec.summary                  = 'Some description for the Shared Module'
    spec.vendored_frameworks      = 'shared.xcframework'
    spec.libraries                = 'c++'
    spec.ios.deployment_target = '14.1'
                
                
                
                
end