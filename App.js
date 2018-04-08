import React, { Component } from 'react';
import {
  Platform,
  StyleSheet,
  View,
  Button
} from 'react-native';
import {NativeModules} from 'react-native';

type Props = {};
export default class App extends Component<Props> {
  render() {
    return (
      <View style={styles.container}>
        <Button
          onPress={() => {
            NativeModules.ParticleSetup.startSetup()
          }}
          title="Setup"
          color="#841584"
        />
      </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#F5FCFF',
  },
});
